package org.shruti.ParkingLot.model;

public class Ticket {
    private final String ticketId;
    private final String spotId;
    private final VehicleType vehicleType;
    private final long entryTime;
    public Ticket(String ticketId, String spotId, VehicleType vehicleType, long entryTime) {
        this.ticketId = ticketId;
        this.spotId = spotId;
        this.vehicleType = vehicleType;
        this.entryTime = entryTime;
    }
    public String getTicketId() {
        return ticketId;
    }
    public String getSpotId() {
        return spotId;
    }
    public VehicleType getVehicleType() {
        return vehicleType;
    }
    public long getEntryTime() {
        return entryTime;
    }
}
