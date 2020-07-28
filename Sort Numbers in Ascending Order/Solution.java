package edabit_challenges;

public class Solution {
    public static int[] sortNumsAscending(int[] nums) {
        if (nums != null) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] > nums[j]) {
                        int swap = nums[i];
                        nums[i] = nums[j];
                        nums[j] = swap;
                    }
                }
            }
            return nums;
        } else {
            return nums;
        }
    }
}
