package com.problem.arrays;

public class BiggestNumbers {
	public static void main(String[] args) {

		// UNSORTED ARRAY
		int[] bigArrays = { 5, 9, 7, 3, 12 };
		int MAX = 0;
		for (int i = 0; i < bigArrays.length; i++) {
			if (bigArrays[i] > MAX) {
				MAX = bigArrays[i];
			}
		}
		System.out.print(MAX);
	}

}
