package gamerverse.api.rooms.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import gamerverse.api.exception.user.InvalidUUID;
import gamerverse.api.exception.room.MaxUserReached;

import java.util.ArrayList;

@JsonPropertyOrder({"size", "users"})
public class UserArray {
    @JsonProperty("users")
    public ArrayList<User> userList;
    @JsonIgnore
    public int maxUser;
    @JsonProperty("size")
    private int size = 0;

    public UserArray(int maxUser) {
        this.userList = new ArrayList<>();
        this.maxUser = maxUser;
    }

    public void add(User user) throws MaxUserReached {
        if (this.isMaxCapacity()) {
            throw new MaxUserReached("Max user reached");
        }
        size += 1;
        this.userList.addLast(user);
    }

    public void remove(User user) {
        if (!this.uuidExist(user.uuid)) {
            throw new InvalidUUID("User not found");
        }
        size -= 1;
        this.userList.remove(user);
    }

    public User get(String uuid) throws InvalidUUID {
        for (User user : this.userList) {
            if (user.uuid.equals(uuid)) {
                return user;
            }
        }
        throw new InvalidUUID("User not found");
    }

    @JsonIgnore
    public ArrayList<String> getUUIDs() {
        ArrayList<String> uuids = new ArrayList<>();
        for (User user : this.userList) {
            uuids.add(user.uuid);
        }

        return uuids;
    }

    public boolean uuidExist(String uuid) {
        for (User user : this.userList) {
            if (user.uuid.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    @JsonIgnore
    public boolean isMaxCapacity() {
        if (this.maxUser == 0) {
            return false;
        }
        return this.size() == this.maxUser;
    }

    public int size() {
        return this.size;
    }
}
