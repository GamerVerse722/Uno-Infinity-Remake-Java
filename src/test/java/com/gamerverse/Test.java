package com.gamerverse;

import com.gamerverse.api.exception.user.InvalidUsername;
import com.gamerverse.api.rooms.Room;
import com.gamerverse.util.Generation;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws InvalidUsername, IOException {
        Generation generation = new Generation();
        generation.maxMessagePerRoom = 0;
        generation.totalRooms = 1;
        generation.initialize();
        Room.writeToFile(new File("src/test/resources/test.json"));
    }
}