package gamerverse.api.rooms;

import gamerverse.api.exception.user.InvalidUsername;
import gamerverse.api.rooms.user.User;

import java.util.LinkedHashMap;
import java.util.UUID;

public class RoomData {
    public final String roomCode;
    public String roomName;
    public Integer maxUser;
    public LinkedHashMap<String, User> userData;

    RoomData(String roomCode, String roomName, Integer maxUser) {
        this.roomCode = roomCode;
        this.roomName = roomName;
        this.maxUser = maxUser;
        this.userData = new LinkedHashMap<>();
    }

    RoomData(String roomCode, String roomName) {
        this(roomCode, roomName, 0);
    }

    public User createUser(String username) throws InvalidUsername {
        String userUUID = generateUUID();
        while (uuidExist(userUUID)) {
            userUUID = generateUUID();
        }
        User user = new User(username, userUUID);
        this.userData.put(userUUID, user);
        return user;
    }

    public Boolean uuidExist(String uuid) {
        return this.userData.containsKey(uuid);
    }

    public String generateUUID() {
        return UUID.randomUUID().toString();
    }
}
