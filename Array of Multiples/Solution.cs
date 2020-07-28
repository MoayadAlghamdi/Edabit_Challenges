using System;

class Solution {
	public static int[] ArrayOfMultiples(int num, int length) {
		int [] nums = new int[length];
		for(int i = 0; i < nums.Length ;i++){
			nums[i] = num * (i+1);
		}
		return nums;
	}
}
