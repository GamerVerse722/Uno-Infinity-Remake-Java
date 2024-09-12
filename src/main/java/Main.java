import api.rooms.Room;
import api.rooms.RoomData;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        RoomData room = Room.createRoom("Monkey");
        room.createUser("Monkey");
        room.createUser("Stuff");
        room.createUser("Administrator");
        room.print();

        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File("src/test/resources/test.json"), Room.rooms);
    }
}