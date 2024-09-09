package api.rooms;

public class RoomData {
    public String roomCode;
    public String roomName;

    RoomData(String roomCode, String roomName) {
        this.roomCode = roomCode;
        this.roomName = roomName;
    }

    public void print() {
        System.out.println("Room Code: " + this.roomCode);
        System.out.println("Room Name: " + this.roomName);
    }
}
