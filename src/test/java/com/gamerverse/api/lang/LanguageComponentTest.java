package com.gamerverse.api.lang;

import com.gamerverse.language.Language;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class LanguageComponentTest {
    @BeforeAll
    static void setup() {
        Language.loadLang("en_us");
    }

    @Test
    void LanguageLiteralReturnT() {
        Assertions.assertEquals("Test", Language.literal("Test").toString());
    }

    @Test
    void LanguageTranslatableHasKeyReturnT() {
        Assertions.assertEquals("Zero", Language.translatable("card.number.0").toString());
    }

    @Test
    void LanguageTranslatableMissingKeyReturnT() {
        Assertions.assertEquals("missing.key", Language.translatable("missing.key").toString());
    }
}
