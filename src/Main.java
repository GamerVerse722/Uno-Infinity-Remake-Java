import api.rooms.Room;
import api.rooms.RoomData;

public class Main {
    public static void main(String[] args) {
        RoomData room = Room.createRoom("Monkey");
        room.print();
    }

    private static void print(String string) {
        System.out.println(string);
    }
}