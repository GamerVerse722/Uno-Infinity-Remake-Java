package gamerverse;

import gamerverse.api.etc.ConsoleColor;
import gamerverse.api.lang.Language;
import gamerverse.api.uno.UnoColor;
import gamerverse.registry.cards.action.PlusTwoCard;

public class RandomTest {
    public static void main(String[] args) {
        line();
        Language.loadLang("en_us");
        System.out.println(new PlusTwoCard(UnoColor.GREEN));
        System.out.println(new PlusTwoCard(UnoColor.YELLOW));
        System.out.println(ConsoleColor.colorText(ConsoleColor.GREEN_BOLD_BRIGHT, new PlusTwoCard(UnoColor.RED)));
        System.out.println(ConsoleColor.colorText(ConsoleColor.YELLOW_BOLD_BRIGHT, new PlusTwoCard(UnoColor.RED)));
        System.out.println(UnoColor.RED.getLanguageComponent());
        line();
    }
    public static void line() {
        System.out.println("-----------------------------------------------");
    }
}
