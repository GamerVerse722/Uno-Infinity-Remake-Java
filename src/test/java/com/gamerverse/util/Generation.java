package com.gamerverse.util;

import com.gamerverse.api.exception.user.InvalidUsername;
import com.gamerverse.api.rooms.Room;
import com.gamerverse.api.rooms.RoomData;
import com.gamerverse.api.rooms.chat.Message;
import com.gamerverse.api.rooms.user.User;

public class Generation {
    public int totalRooms = 3;
    public int roomNameLength = 12;
    public int usernameLength = 8;
    public int messageLength = 20;
    public int totalUsersPerRoom = 3;
    public int totalMessagesPerUser = 3;
    public int maxMessagePerRoom = 0;

    public Generation() {
    }

    public void initialize() throws InvalidUsername {
        this.generateRooms();
    }

    private void generateRooms() throws InvalidUsername {
        for (int i = 0; i < this.totalRooms; i++) {
            RoomData roomData = Room.createRoom(Tools.generateRandomString(this.roomNameLength));
            roomData.chat.maxMessage = this.maxMessagePerRoom;
            this.generateUsers(roomData);
        }
    }

    private void generateUsers(RoomData roomData) throws InvalidUsername {
        for (int i = 0; i < this.totalUsersPerRoom; i++) {
            User user = roomData.createUser(Tools.generateRandomString(this.usernameLength));
            this.generateMessages(roomData, user);
        }
    }

    private void generateMessages(RoomData roomData, User user) {
        for (int i = 0; i < this.totalMessagesPerUser; i++) {
            roomData.chat.addMessage(new Message(user, Tools.generateRandomString(this.messageLength)));
        }
    }
}
