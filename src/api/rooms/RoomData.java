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

    public HashMap<String, Object> to_HashMap() {
        HashMap<String, Object> data_map = new HashMap<>();
        data_map.put("room_code", this.roomCode);
        data_map.put("room_name", this.roomName);
        data_map.put("max_user", this.maxUser);
        data_map.put("members_list", this.membersList);
        return data_map;
    }
    public void print() {
        System.out.println(to_HashMap());
    }
}
