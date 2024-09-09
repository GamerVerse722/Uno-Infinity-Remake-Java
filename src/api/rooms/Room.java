package api.rooms;

import java.util.HashMap;
import java.util.Random;

public class Room {
    public static HashMap<String, RoomData> rooms = new HashMap<>();
    private static final Random random = new Random();

    public static RoomData createRoom(String roomName) {
        String roomCode = generateCode(8);
        while (roomExist(roomCode) ) {
            roomCode = generateCode(8);
        }

        RoomData room = new RoomData(roomCode, roomName);
        rooms.put(roomName, room);
        return room;
    }

    public static String generateCode(Integer length) {
        StringBuilder code = new StringBuilder();

        for (int i = 0; i < length; i++) {
            code.append(random.nextInt(10));
        }

        return code.toString();
    }

    public static boolean roomExist(String room) {
        return rooms.containsKey(room);
    }

    public static RoomData getRoom(String roomCode) {
        return rooms.get(roomCode);
    }

    public static void deleteRoom(String roomCode) {
        rooms.remove(roomCode);
    }
}
