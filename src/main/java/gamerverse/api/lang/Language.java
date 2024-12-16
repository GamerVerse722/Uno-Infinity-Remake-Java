package gamerverse.api.lang;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

public class Language {
    private static String lang = "en_us";
    private static ConcurrentHashMap<String, String> langMap;
    private static final HashSet<String> keys = new HashSet<>();

    public static boolean langExist(String langCode) {
        String directory = "src/main/resources/lang/" + langCode + ".json";
        File file = new File(directory);
        return file.exists();
    }

    public static void loadLang(String langCode) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            File file = new File("src/main/resources/lang/" + langCode + ".json");
            langMap = mapper.readValue(file, new TypeReference<>() {
            });
            lang = langCode;
        } catch (IOException e) {
            System.out.println("Failed to read " + langCode + "lang file");
        }
    }

    public static ConcurrentHashMap<String, String> getLangMap() {
        return langMap;
    }

    public static String getLang() {
        return lang;
    }

    public static String getValue(String key) {
        if (langMap.containsKey(key)) {
            return langMap.get(key);
        }
        return key;
    }

    public static boolean hasValue(String key) {
        return langMap.containsKey(key);
    }

    public static HashSet<String> getRegisteredKeys() {
        return keys;
    }


    public static @NotNull HashSet<String> getTranslatableKeys() {
        return new HashSet<>(langMap.keySet());
    }

    public static @NotNull HashSet<String> getUntranslatableKeys() {
        HashSet<String> result = new HashSet<>();
        for (String key: keys) {
            if (!langMap.containsKey(key)) {
                result.add(key);
            }
        }
        return result;
    }

    @Contract("_ -> new")
    public static @NotNull LanguageComponent literal(String key) {
        return new LanguageComponent(key, false);
    }

    @Contract("_ -> new")
    public static @NotNull LanguageComponent translatable(String key) {
        keys.add(key);
        return new LanguageComponent(key, true);
    }
}

