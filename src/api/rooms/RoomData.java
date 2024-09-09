package api.rooms;

import java.util.LinkedHashMap;
import java.util.UUID;

public class RoomData {
    public String roomCode;
    public String roomName;
    public Integer maxUser;
    public LinkedHashMap<String, String> membersList;

    RoomData(String roomCode, String roomName, Integer maxUser) {
        this.roomCode = roomCode;
        this.roomName = roomName;
        this.maxUser = maxUser;
        this.membersList = new LinkedHashMap<>();
    }

    RoomData(String roomCode, String roomName) {
        this(roomCode, roomName, 0);
    }

    public void createUser(String username) {
        String userUUID = generateUUID();
        while (uuidExist(userUUID)) {
            userUUID = generateUUID();
        }

        this.membersList.put(userUUID, username);
    }

    public Boolean uuidExist(String uuid) {
        return this.membersList.containsKey(uuid);
    }

    public String generateUUID() {
        return UUID.randomUUID().toString();
    }

    public void print() {
        System.out.println("Room Code: " + this.roomCode);
        System.out.println("Room Name: " + this.roomName);
        System.out.println("Room Max User: " + this.maxUser);
        System.out.println("--------------------------------");
        for (String key : this.membersList.keySet()) {
            System.out.print("UUID: " + key + "   ");
            System.out.println("Username: " + this.membersList.get(key));
        }
    }
}
