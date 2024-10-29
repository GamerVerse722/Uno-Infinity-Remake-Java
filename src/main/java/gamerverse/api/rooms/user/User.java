package gamerverse.api.rooms.user;

import com.fasterxml.jackson.annotation.JsonFormat;
import gamerverse.api.exception.user.InvalidUsername;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class User {
    public String username;
    public final String uuid;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    public Date joinedAt;

    @JsonProperty("vip")
    public boolean isVIP = false;

    public User(String username, String uuid) throws InvalidUsername {
        if (username.isBlank()) {
            throw new InvalidUsername("Username cannot be empty");
        }
        this.username = username;
        this.uuid = uuid;
        this.joinedAt = new Date();
    }

}
