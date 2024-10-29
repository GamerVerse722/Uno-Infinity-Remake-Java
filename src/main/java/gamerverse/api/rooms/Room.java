package gamerverse.api.rooms;

import com.fasterxml.jackson.databind.ObjectMapper;
import gamerverse.api.exception.room.RoomNotFound;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;

public class Room {
    public static HashMap<String, RoomData> rooms = new HashMap<>();
    private static final Random random = new Random();

    public static RoomData createRoom(String roomName) {
        String roomCode = generateCode(8);
        while (roomExist(roomCode)) {
            roomCode = generateCode(8);
        }

        RoomData room = new RoomData(roomCode, roomName);
        rooms.put(roomCode, room);
        return room;
    }

    public static String generateCode(Integer length) {
        StringBuilder code = new StringBuilder();

        for (int i = 0; i < length; i++) {
            code.append(random.nextInt(10));
        }

        return code.toString();
    }

    public static boolean roomExist(String roomCode) {
        return rooms.containsKey(roomCode);
    }

    public static RoomData getRoom(String roomCode) throws RoomNotFound {
        if (!roomExist(roomCode)) {
            throw new RoomNotFound("Room not found");
        }
        return rooms.get(roomCode);
    }

    public static void deleteRoom(String roomCode) throws RoomNotFound {
        if (!roomExist(roomCode)) {
            throw new RoomNotFound("Room not found");
        }
        rooms.remove(roomCode);
    }

    public static void writeToFile() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writerWithDefaultPrettyPrinter().writeValue(new File("src/test/resources/test.json"), Room.rooms);
    }
}
