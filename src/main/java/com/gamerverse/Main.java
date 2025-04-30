package com.gamerverse;

import com.gamerverse.api.lang.Language;

public class Main {
    public static void main(String[] args) {
        Language.loadLang("en_us");
        ModLoader.startLoader();
    }
}