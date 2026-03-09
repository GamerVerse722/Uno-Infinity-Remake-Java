package com.gamerverse.network.rooms;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gamerverse.exception.user.InvalidUsername;
import com.gamerverse.network.rooms.chat.Chat;
import com.gamerverse.network.rooms.user.User;
import com.gamerverse.network.rooms.user.UserArray;

import java.util.UUID;

public class RoomData {
    @JsonIgnore
    public final String roomCode;
    public String roomName;
    public Integer maxUser;
    public UserArray userData;
    public Chat chat;

    RoomData(String roomCode, String roomName, Integer maxUser, Integer maxMessage) {
        this.roomCode = roomCode;
        this.roomName = roomName;
        this.maxUser = maxUser;
        this.userData = new UserArray(maxUser);
        this.chat = new Chat(maxMessage);
    }

    RoomData(String roomCode, String roomName) {
        this(roomCode, roomName, 0, 0);
    }

    public User createUser(String username) throws InvalidUsername {
        String userUUID = generateUUID();
        while (uuidExist(userUUID)) {
            userUUID = generateUUID();
        }
        User user = new User(username, userUUID);
        this.userData.add(user);
        return user;
    }

    public Boolean uuidExist(String uuid) {
        return this.userData.uuidExist(uuid);
    }

    public String generateUUID() {
        return UUID.randomUUID().toString();
    }
}
