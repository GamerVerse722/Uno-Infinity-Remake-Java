package com.gamerverse.registry;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Registry<T> {

    private final Map<String, T> entries = new HashMap<>();

    public void register(String id, T value) {
        if(entries.containsKey(id))
            throw new IllegalStateException("Duplicate id: " + id);

        entries.put(id, value);
    }

    public T get(String id) {
        return entries.get(id);
    }

    public Collection<T> values() {
        return entries.values();
    }
}
