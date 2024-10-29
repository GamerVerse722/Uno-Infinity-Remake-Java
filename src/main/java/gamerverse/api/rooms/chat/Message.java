package gamerverse.api.rooms.chat;

import com.fasterxml.jackson.annotation.JsonFormat;
import gamerverse.api.rooms.user.User;

import java.util.Date;

public class Message {
    public final String username;
    public final String message;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    public final Date timestamp;

    public Message(User user, String message) {
        this.username = user.username;
        this.message = message;
        this.timestamp = new Date();
    }
}
