package org.shruti.ParkingLot;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;


import org.shruti.ParkingLot.model.SpotType;
import org.shruti.ParkingLot.model.Ticket;
import org.shruti.ParkingLot.model.ParkingSpot;
import org.shruti.ParkingLot.model.VehicleType;


public class ParkingLot {
       // If multiple floors, maintain 1) map of floors to spots or 2) use ParkingFloor class with list of spots
        private final List<ParkingSpot> spots;
        private final Map<String, Ticket> activeTickets;
        // if different rates for different vehicle types, 1) use map or 2) strategy pattern
        private final long hourlyRate;
        public ParkingLot(List<ParkingSpot> spots, long hourlyRate) {
            this.spots = spots;
            this.activeTickets = new HashMap<>();
            this.hourlyRate = hourlyRate;
        }
        // Option 1 : use method level synchronization
        // Option 2 : use synchroned for spot 
        public Ticket enter(VehicleType vehicleType){
            while(true) {
                ParkingSpot availableSpot = findAvailableSpot(vehicleType);
                if(availableSpot==null) {
                    throw new RuntimeException("No available spot");
                }
                synchronized(availableSpot) {
                    if(availableSpot.isOccupied()) { // double checked locking
                        continue; // spot got occupied, try again
                    }
                    availableSpot.markOccupied();
                    String ticketId = UUID.randomUUID().toString();
                    Ticket ticket = new Ticket(ticketId, availableSpot.getId(), vehicleType, System.currentTimeMillis());
                    activeTickets.put(ticketId, ticket);
                    return ticket;
             }
          }
        }
        public long exit(String ticketId) {
            if(ticketId==null || ticketId.isEmpty()) {
                throw new RuntimeException("Invalid Ticket");
            }
            Ticket ticket = activeTickets.get(ticketId);
            if(ticket==null) {
                throw new RuntimeException("Ticket not found or already used");
            }
            long fee = computeFee(ticket.getEntryTime(), System.currentTimeMillis());
            markSpotFree(ticket.getSpotId());
            activeTickets.remove(ticketId);
            return fee;

        }
        // can use strategy pattern with different allocation strategies based on occupancy, time of day etc.
        private ParkingSpot findAvailableSpot(VehicleType vehicleType) {
            SpotType requiredSpotType = mapVehicleToSpotType(vehicleType); 
            for(ParkingSpot spot : spots) {
                if(!spot.isOccupied() && spot.getSpotType() == requiredSpotType) {
                    return spot;
                }
            }
            return null;
        }
        
        private SpotType mapVehicleToSpotType(VehicleType vehicleType) {
            switch(vehicleType) {
                case MOTORCYCLE:
                    return SpotType.MOTORCYCLE;
                case CAR:
                    return SpotType.CAR;
                case LARGE:
                    return SpotType.LARGE;
                default:
                    throw new IllegalArgumentException("Unknown Vehicle Type");
            }
        }
        // if computaion logic is complex, use strategy pattern
        private long computeFee(long entryTime, long exitTime) {
            long durationMillis = exitTime - entryTime;
            long hours = (durationMillis + 3599999) / 3600000; // Round up to next hour
            return hours * hourlyRate;
        }
        private void markSpotFree(String spotId) {
            for(ParkingSpot spot : spots) {
                if(spot.getId().equals(spotId)) {
                    spot.markFree();
                    return;
                }
            }
        }
}
