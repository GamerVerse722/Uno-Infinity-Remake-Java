package gamerverse.api.lang;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

public class Language {
    private static String lang = "en_us";
    private static ConcurrentHashMap<String, String> langMap;

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

    public static String getLang() {
        return lang;
    }

    public static String getValue(String key) {
        if (langMap.containsKey(key)) {
            return langMap.get(key);
        }
        return key;
    }

    public static ConcurrentHashMap<String, String> getLangMap() {
        return langMap;
    }

    public static LanguageComponent literal(String key) {
        return new LanguageComponent(key, false);
    }

    public static LanguageComponent translatable(String key) {
        return new LanguageComponent(key, true);
    }
}

