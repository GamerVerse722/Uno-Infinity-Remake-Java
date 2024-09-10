package api.rooms;

import java.util.HashMap;
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
        HashMap<String, Object> test = new HashMap<>();
        test.put("room_code", this.roomCode);
        test.put("room_name", this.roomName);
        test.put("max_user", this.maxUser);
        test.put("members_list", this.membersList);
        System.out.println(test);
    }
}
