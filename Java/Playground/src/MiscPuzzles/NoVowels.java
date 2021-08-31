package MiscPuzzles;

import java.util.ArrayList;
import java.util.List;

public class NoVowels {

    public static void main(String args[]) {
        noVowels("This website is for losers LOL!");
    }

    public static String noVowels(String str) {
        String result = str.replaceAll("(?i)[aeiou]","");
        System.out.println(result);
        return result;
    }
}
