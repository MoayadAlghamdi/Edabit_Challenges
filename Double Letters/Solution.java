package edabit_challenges;

public class Solution {

    public static boolean doubleLetters(String word) {
        char letter = word.charAt(0);
        for (int i = 1; i < word.length(); i++) {
            if (letter == word.charAt(i)) {
                return true;
            } else {
                letter = word.charAt(i);
            }
        }
        return false;
    }
}
