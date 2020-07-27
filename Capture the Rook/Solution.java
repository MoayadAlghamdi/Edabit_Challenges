package edabit_challenges;

public class Solution {

    public static boolean canCapture(String[] rooks) {
        int count = 1;
        for (int i = 0; i < rooks.length; i++) {
            for (int j = 0; j < rooks.length; j++) {
                if (rooks[i].charAt(j) == rooks[count].charAt(j)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
