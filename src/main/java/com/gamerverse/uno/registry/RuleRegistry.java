package com.gamerverse.uno.registry;

import com.gamerverse.registry.Registry;
import com.gamerverse.uno.rules.GameRule;

import java.util.function.Supplier;

public class RuleRegistry {
    public static final Registry<Supplier<GameRule>> RULES = new Registry<>();
}
