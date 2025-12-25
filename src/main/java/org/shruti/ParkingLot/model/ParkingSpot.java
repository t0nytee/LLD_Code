package org.shruti.ParkingLot.model;

public class ParkingSpot {
    private final String id;
    private final SpotType spotType;
    private boolean isOccupied;
    public ParkingSpot(String id, SpotType spotType) {
        this.id = id;
        this.spotType = spotType;
        this.isOccupied = false;
    }
    public String getId() {
        return id;
    }
    public SpotType getSpotType() {
        return spotType;
    }
    public boolean isOccupied() {
        return isOccupied;
    }
    public void markOccupied() {
        isOccupied = true;
    }
    public void markFree() {
        this.isOccupied = false;
    }
}
