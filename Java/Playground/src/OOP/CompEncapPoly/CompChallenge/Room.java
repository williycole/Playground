package OOP.CompEncapPoly.CompChallenge;

public class Room {
    private RoomDoor roomDoor;
    private RoomFan roomFan;
    private RoomWindow roomWindow;

    public Room(RoomDoor roomDoor, RoomFan roomFan, RoomWindow roomWindow) {
        this.roomDoor = roomDoor;
        this.roomFan = roomFan;
        this.roomWindow = roomWindow;
    }

    public RoomDoor getRoomDoor() {
        return roomDoor;
    }

    public RoomFan getRoomFan() {
        return roomFan;
    }

    public RoomWindow getRoomWindow() {
        return roomWindow;
    }
}
