package edabit_challenges;

public class Solution {

    public static String sevenBoom(int[] arr) {
        for (int i : arr) {
            if ((i == 7) || (i % 10 == 7) || ((i / 10) - (i / 10 % 1)) == 7) {
                return "Boom!";
            }
        }
        return "there is no 7 in the array";
    }
}
