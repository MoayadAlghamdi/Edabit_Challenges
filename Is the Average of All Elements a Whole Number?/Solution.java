package edabit_challenges;

public class Solution {

    public static boolean isAvgWhole(int[] arr) {
        double sum = 0, result = 0;
        for (int index : arr) {
            sum += index;
        }
        return (sum / arr.length * 10) % 10 == 0 ? true : false;
    }
}
