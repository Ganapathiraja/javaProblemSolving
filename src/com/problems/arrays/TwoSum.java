package com.problems.arrays;

class Solution {

	static int[] mains(int[] nums, int target) {

		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length - 1; j++) {
				if (nums[i] + nums[j] == target) {
					System.out.println(nums[i] + "," + nums[j]);

					return new int[] { nums[i], nums[j] };
				}

			}
		}

		return new int[] { 0, 0 };
	}
}

public class TwoSum {
	public static void main(String[] args) {

		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		System.out.println(Solution.mains(nums, target).toString());

	}
}
