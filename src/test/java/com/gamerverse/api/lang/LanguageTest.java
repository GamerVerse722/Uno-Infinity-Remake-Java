package com.gamerverse.api.lang;

import com.gamerverse.api.lang.Language;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class LanguageTest {
    @BeforeAll
    static void setup() {
        Language.loadLang("en_us");
    }

    @Test
    void LanguageCodeExistReturnT() {
        Assertions.assertTrue(Language.langExist("en_us"));
    }

    @Test
    void LanguageCodeExistReturnF() {
        Assertions.assertFalse(Language.langExist("en_yn"));
    }

    @Test
    void LanguageHasKeyReturnT() {
        Assertions.assertTrue(Language.hasValue("card.number.0"));
    }

    @Test
    void LanguageHasKeyReturnF() {
        Assertions.assertFalse(Language.hasValue("card.random.random"));
    }
}
