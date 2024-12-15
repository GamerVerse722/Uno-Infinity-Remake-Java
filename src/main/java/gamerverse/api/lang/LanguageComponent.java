package gamerverse.api.lang;

public class LanguageComponent {
    private final String key;
    private final boolean translatable;

    LanguageComponent(String key, boolean translatable) {
        this.key = key;
        this.translatable = translatable;
    }

    public boolean isTranslatable() {
        return this.translatable;
    }

    public String getKey() {
        return this.key;
    }

    public String toString() {
        if (translatable) {
            return Language.getValue(this.key);
        }
        return this.key;
    }
}
