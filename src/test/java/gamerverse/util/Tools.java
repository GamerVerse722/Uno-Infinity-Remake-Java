package gamerverse.util;

import java.util.Random;

public class Tools {
    private static final Random random = new Random();

    public static String generateRandomString(int length) {
        StringBuilder username = new StringBuilder();
        for (int i = 0; i < length; i++) {
            username.append((char) (random.nextInt(26) + 'a'));
        }
        return username.toString();
    }
}
