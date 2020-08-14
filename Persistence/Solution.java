package edabit_challenges;

public class Solution {
    public static int additivePersistence(int n) {
        String str = String.valueOf(n);
        int counter = 0;
        while (true) {
            int sum = 0;
            if (str.length() > 1) {
                for (char letter : str.toCharArray()) {
                    sum += Integer.parseInt(letter + "");
                }
                str = String.valueOf(sum);
                counter++;
            } else {
                return counter;
            }
        }
    }
    public static long multiplicativePersistence(long n) {
        String str = String.valueOf(n);
        long counter = 0;
        while (true) {
            long sum = 1;
            if (str.length() > 1) {
                for (char letter : str.toCharArray()) {
                    sum *= Long.parseLong(letter + "");
                }
                str = String.valueOf(sum);
                counter++;
            } else {
                return counter;
            }
        }

    }
}

