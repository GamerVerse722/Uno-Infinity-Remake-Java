package com.gamerverse;

import com.gamerverse.api.annotation.Mod;
import org.reflections.Reflections;

import java.util.Set;

import static com.gamerverse.Main.line;

public class ModLoader {
    public static void startLoader() {
        try {
            Reflections reflections = new Reflections("com.gamerverse.mods");

            Set<Class<?>> modClasses = reflections.getTypesAnnotatedWith(Mod.class);
            for (Class<?> modClass : modClasses) {
                modClass.getDeclaredClasses().newInstance();
            }

        } catch (Exception e) {
            line();
            e.printStackTrace();
            line();
        }
    }
}
