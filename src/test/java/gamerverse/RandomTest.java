package gamerverse;

import gamerverse.api.etc.ConsoleColor;
import gamerverse.api.lang.Language;
import gamerverse.api.uno.UnoColor;
import gamerverse.registry.cards.action.PlusTwoCard;

public class RandomTest {
    public static void main(String[] args) {
        line();
        Language.loadLang("en_us");
        System.out.println(new PlusTwoCard(UnoColor.GREEN).toString(true));
        System.out.println(new PlusTwoCard(UnoColor.YELLOW).toString(true));
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
