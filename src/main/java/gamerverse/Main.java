package gamerverse;

import gamerverse.api.exception.user.InvalidUsername;
import gamerverse.api.rooms.Room;
import gamerverse.api.rooms.RoomData;
import com.fasterxml.jackson.databind.ObjectMapper;
import gamerverse.api.rooms.user.User;
import gamerverse.api.rooms.user.UserArray;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InvalidUsername {
        UserArray array = new UserArray();
        User newUser = new User("Among Us", "1234");
        array.addUser(newUser);
        newUser.username = "Monkey";
        System.out.println(newUser.username);
        System.out.println(array.getUser("1234").username);

        RoomData room = Room.createRoom("Monkey");
        User user = room.createUser("Monkey");
        user.isVIP = true;
        room.createUser("Stuff");
        room.createUser("Administrator");

        ObjectMapper mapper = new ObjectMapper();
        mapper.writerWithDefaultPrettyPrinter().writeValue(new File("src/test/resources/test.json"), Room.rooms);
    }
}