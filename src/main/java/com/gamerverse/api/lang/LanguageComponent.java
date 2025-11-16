package com.gamerverse.api.lang;

import org.jetbrains.annotations.NotNull;

public record LanguageComponent(String key, boolean translatable) {

    public @NotNull String toString() {
        if (translatable) {
            return Language.getValue(this.key);
        }
        return this.key;
    }
}
