import java.util.LinkedList;

public class GarageFloor {
    int floorNum;
    int totalSpots;
    int takenSpots;
    LinkedList<Vehicle> spotIndex;

    public GarageFloor(int floorNum, int totalSpots){
        this.floorNum = floorNum;
        this.totalSpots = totalSpots;
        takenSpots = 0;
        spotIndex = new LinkedList<Vehicle>();
    }
    public GarageFloor(int floorNum, int totalSpots, int takenSpots, LinkedList<Vehicle> spotIndex){
        this.floorNum = floorNum;
        this.totalSpots = totalSpots;
        this.takenSpots = takenSpots;
        this.spotIndex = spotIndex;
    }

    // getters
    public int getFloorNum() {
        return floorNum;
    }
    public int getTakenSpots() {
        return takenSpots;
    }
    public int getTotalSpots() {
        return totalSpots;
    }
    public LinkedList<Vehicle> getSpotIndex() {
        return spotIndex;
    }

    // setters
    public void setFloorNum(int floorNum) {
        this.floorNum = floorNum;
    }
    public void setTakenSpots(int takenSpots) {
        this.takenSpots = takenSpots;
    }
    public void setTotalSpots(int totalSpots) {
        this.totalSpots = totalSpots;
    }
    public void setSpotIndex(LinkedList<Vehicle> spotIndex) {
        this.spotIndex = spotIndex;
    }
}
