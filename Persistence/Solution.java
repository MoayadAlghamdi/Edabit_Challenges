package edabit_challenges;

public class Solution {

   
    public static int triangle(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum ;
    }
}

