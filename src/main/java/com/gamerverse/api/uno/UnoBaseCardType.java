package com.gamerverse.api.uno;

import com.gamerverse.api.lang.Language;
import com.gamerverse.api.lang.LanguageComponent;

public enum UnoBaseCardType {
    NUMBER("number"),
    ACTION("action"),
    WILD("wild");

    private final String id;
    private final String idName;
    private final LanguageComponent name;

    UnoBaseCardType(String id) {
        this.id = "type." + id;
        this.idName = id;
        this.name = Language.translatable(this.id);
    }

    public String getId() {
        return this.id;
    }

    public String getIdName() {
        return this.idName;
    }

    public LanguageComponent getLanguageComponent() {
        return this.name;
    }
}
