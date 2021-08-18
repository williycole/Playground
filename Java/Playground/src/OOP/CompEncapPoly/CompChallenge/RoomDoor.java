package OOP.CompEncapPoly.CompChallenge;

public class RoomDoor {
    private boolean isClosed;
    private int numDoors;

    public RoomDoor(boolean isClosed, int numDoors) {
        this.isClosed = isClosed;
        this.numDoors = numDoors;
    }

    public void areAllDoorsClosed(int numClosedDoors){
        if(numClosedDoors == numDoors && isClosed){
            System.out.println("All your doors are closed");
        } else {
            System.out.println("All your doors are not closed");
        }
    }

    public boolean isClosed() {
        return isClosed;
    }

    public int getNumDoors() {
        return numDoors;
    }
}
