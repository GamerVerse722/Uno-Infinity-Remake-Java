package com.gamerverse.mods;

import com.gamerverse.api.annotation.Mod;
import com.gamerverse.api.etc.CircularArrayList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

@Mod("another-test")
public class AnotherTest {
    public AnotherTest() throws FileNotFoundException {
//        Scanner scanner = new Scanner(new File("src/main/resources/META-INF/mods.toml"));
//        while (scanner.hasNextLine()) {
//            System.out.println(scanner.nextLine());
//        }
        CircularArrayList<Integer> list = new CircularArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.next(4);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
    }
}
