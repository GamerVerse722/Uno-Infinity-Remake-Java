package com.gamerverse;

import com.gamerverse.api.annotation.Mod;
import io.github.classgraph.ClassGraph;
import io.github.classgraph.ScanResult;

import java.lang.reflect.Constructor;

public class ModLoader {
    public static void startLoader() {
        try (ScanResult scanResult = new ClassGraph()
                .enableClassInfo() // Enables scanning of class information
                .enableAnnotationInfo() // Enables scanning for annotations
                .scan()) {

            scanResult.getClassesWithAnnotation(Mod.class.getName())
                    .forEach(classInfo -> {
                        try {
                            // Get the class by name
                            Class<?> clazz = Class.forName(classInfo.getName());

                            // Retrieve the @Mod annotation
                            Mod modAnnotation = clazz.getAnnotation(Mod.class);

                            // Print the mod ID
                            System.out.println("Found Mod: " + modAnnotation.value());

                            // Create an instance of the class
                            Constructor<?> constructor = clazz.getDeclaredConstructor();
                            Object modInstance = constructor.newInstance();

                            // Example: Call a method on the mod instance
                            System.out.println("Loaded mod instance: " + modInstance);

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    });
        }
    }
}
