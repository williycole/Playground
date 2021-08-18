package MiscPuzzles;


/*
 * In a board game, a piece may advance 1-6 tiles forward depending on the number rolled on a six-sided dice.
 * If you advance your piece onto the same tile as another player's piece, both of you earn a bonus.
 * Given you and your friend's tile number, create a function that returns if it's possible to earn a bonus when you roll the dice.
 * Examples
 * possibleBonus(3, 7) ➞ true
 * possibleBonus(1, 9) ➞ false
 * possibleBonus(5, 3) ➞ false * */
public class TileTeamwork {
    public static void main(String[] args) {
        possibleBonus(3, 7); //➞true
        possibleBonus(1, 9); //➞false
        possibleBonus(5, 3); //➞false
    }

    public static boolean possibleBonus(int x, int y) {
        boolean result = ((x < y) && ((y - x) <= 6)) ? true : false;
        System.out.println(result);
        return result;

    }
}
