import api.rooms.Room;
import api.rooms.RoomData;
import static api.utils.Utils.print;

public class Main {
    public static void main(String[] args) {
        RoomData room = Room.createRoom("Monkey");
        room.createUser("Monkey");
        room.createUser("Stuff");
        room.createUser("Administrator");
//        print(room.membersList.lastEntry().toString());
        room.print();
    }
}