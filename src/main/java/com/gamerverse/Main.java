package com.gamerverse;

import com.gamerverse.language.Language;
import com.gamerverse.engine.mod.ModLoader;

public class Main {
    public static void main(String[] args) {
        Language.loadLang("en_us");
        ModLoader.startLoader();
    }
}