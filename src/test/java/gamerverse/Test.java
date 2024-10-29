package gamerverse;

import gamerverse.api.exception.user.InvalidUsername;
import gamerverse.api.rooms.Room;
import gamerverse.util.Generation;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws InvalidUsername, IOException {
        Generation generation = new Generation();
        generation.maxMessagePerRoom = 0;
        generation.totalRooms = 1;
        generation.initialize();
        Room.writeToFile();
    }
}