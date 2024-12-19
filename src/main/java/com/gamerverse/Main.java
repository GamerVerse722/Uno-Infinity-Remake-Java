package com.gamerverse;

import com.gamerverse.api.etc.ConsoleColor;

public class Main {
    public static void main(String[] args) {
        line();
        ModLoader.startLoader();
        line();
    }
    public static void line() {
        System.out.println(ConsoleColor.colorWild("-----------------------------------------------"));
    }
}