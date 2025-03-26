package com.gamerverse.mods;

import com.gamerverse.api.annotation.Mod;
import com.gamerverse.api.etc.CircularArrayList;
import com.gamerverse.api.etc.ConsoleColor;

import java.io.FileNotFoundException;
import java.text.MessageFormat;
import java.util.ArrayList;

@Mod("another-test")
public class AnotherTest {
    public AnotherTest() {
        CircularArrayList<Integer> list = new CircularArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        printList(list);
        list.addFirst(6);
        printList(list);
        list.setIndex(5);
        list.removeLast();
        printList(list);
    }

    private static void printList(CircularArrayList<Integer> list) {
        ArrayList<String> array = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            String value = String.valueOf(i);
            if (i == list.getIndex()) {
                array.add(ConsoleColor.colorText(ConsoleColor.YELLOW_BOLD_BRIGHT, value));
                continue;
            }
            array.add(value);
        }

        System.out.println(MessageFormat.format("""
            ---------------------------
            Index: {0}
            Size: {1}
            Array: {2}""",
            list.getIndex(),
            list.size(),
            array));
    }
}
