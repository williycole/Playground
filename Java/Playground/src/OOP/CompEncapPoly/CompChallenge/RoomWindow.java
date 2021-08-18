package OOP.CompEncapPoly.CompChallenge;

public class RoomWindow {
    private boolean isOpen;
    private int numWindows;

    public RoomWindow(boolean isOpen, int numWindows) {
        this.isOpen = isOpen;
        this.numWindows = numWindows;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public int getNumWindows() {
        return numWindows;
    }
}
