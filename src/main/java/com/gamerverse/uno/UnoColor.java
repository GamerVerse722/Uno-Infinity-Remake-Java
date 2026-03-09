package com.gamerverse.uno;

import com.gamerverse.engine.utils.ConsoleColor;
import com.gamerverse.language.Language;
import com.gamerverse.language.LanguageComponent;

public enum UnoColor {
    NONE("none", ConsoleColor.RESET),
    WILD("wild", ConsoleColor.RESET),
    RED("red", ConsoleColor.RED),
    BLUE("blue", ConsoleColor.BLUE),
    GREEN("green", ConsoleColor.GREEN),
    YELLOW("yellow", ConsoleColor.YELLOW_BRIGHT),;

    private final String id;
    private final String idName;
    private final ConsoleColor color;
    private final LanguageComponent name;

    UnoColor(String id, ConsoleColor color) {
        this.id = "color." + id;
        this.idName = id;
        this.color = color;
        this.name = Language.translatable(this.id);
    }

    public String getId() {
        return this.id;
    }

    public String getIdName() {
        return this.idName;
    }

    public ConsoleColor getConsoleColor() {
        return this.color;
    }

    public LanguageComponent getLanguageComponent() {
        return name;
    }
}
