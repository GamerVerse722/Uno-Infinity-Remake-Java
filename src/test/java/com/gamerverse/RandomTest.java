package com.gamerverse;

import com.gamerverse.api.annotation.Mod;
import com.gamerverse.api.etc.ConsoleColor;
import com.gamerverse.api.lang.Language;
import com.gamerverse.api.uno.UnoColor;
import com.gamerverse.registry.cards.action.PlusTwoCard;

@Mod("other")
public class RandomTest {
    public RandomTest() {
        line();
        Language.loadLang("en_us");
        System.out.println(new PlusTwoCard(UnoColor.GREEN));
        System.out.println(new PlusTwoCard(UnoColor.YELLOW));
        System.out.println(new PlusTwoCard(UnoColor.BLUE));
        System.out.println(new PlusTwoCard(UnoColor.RED));
        System.out.println(new PlusTwoCard(UnoColor.WILD));
        System.out.println(ConsoleColor.colorWild("Among Us"));
        System.out.println(ConsoleColor.colorText(ConsoleColor.RED_BOLD_BRIGHT, new PlusTwoCard(UnoColor.WILD)));
        System.out.println(ConsoleColor.colorText(ConsoleColor.GREEN_BOLD_BRIGHT, new PlusTwoCard(UnoColor.RED)));
        System.out.println(ConsoleColor.colorText(ConsoleColor.YELLOW_BOLD_BRIGHT, new PlusTwoCard(UnoColor.RED)));
        line();

        System.out.println(Language.translatable("test.test"));
        System.out.println(Language.hasValue("test.test"));

        System.out.println(Language.getRegisteredKeys());
        System.out.println(Language.getTranslatableKeys());
        System.out.println(Language.getUntranslatableKeys());
        line();
    }
    public static void line() {
        System.out.println("-----------------------------------------------");
    }
}
