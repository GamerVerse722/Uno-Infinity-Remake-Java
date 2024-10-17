package gamerverse.api.rooms.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import gamerverse.api.exception.user.InvalidUUID;
import gamerverse.api.exception.user.MaxUserReached;

import java.util.ArrayList;

public class UserArray {
    @JsonProperty("users")
    public ArrayList<User> userList;
    @JsonIgnore
    public int maxUser;

    public UserArray() {
        this.userList = new ArrayList<>();
    }

    public void addUser(User user) throws MaxUserReached {
        if (!this.isMaxCapacity()) {
            throw new MaxUserReached("Max user reached");
        }
        this.userList.addLast(user);
    }

    public void removeUser(User user) {
        this.userList.remove(user);
    }

    public User getUser(String uuid) {
        for (User user : this.userList) {
            if (user.uuid.equals(uuid)) {
                return user;
            }
        }
        throw new InvalidUUID("User not found");
    }

    public boolean userExist(String uuid) {
        for (User user : this.userList) {
            if (user.uuid.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public boolean isMaxCapacity() {
        return this.userList.size() == this.maxUser;
    }
}
