package com.gamerverse.api.rooms.chat;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Chat {
    public ArrayList<Message> messages;
    public int maxMessage;
    @JsonProperty("size")
    private int size;

    public Chat(int maxMessage) {
        this.messages = new ArrayList<>();
        this.maxMessage = maxMessage;
    }

    public void addMessage(Message message) {
        if (this.messagesFull()) {
            this.messages.removeFirst();
            this.size -= 1;
        }

        this.messages.add(message);
        this.size += 1;
    }

    private boolean messagesFull() {
        if (this.maxMessage == 0) {
            return false;
        }
        return this.size >= this.maxMessage;
    }
}
