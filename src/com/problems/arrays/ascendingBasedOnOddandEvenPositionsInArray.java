package com.problems.arrays;
// in odd positions descending order 

import java.util.Arrays;

// even positions ascending order in an array

// input : 1 2 3 4 5 6 7 8 9 
//output : 9 2 7 4 5 6 3 8 1

public class ascendingBasedOnOddandEvenPositionsInArray {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		Arrays.sort(array);

		int len = array.length - 1;
		System.out.println(len);

		for (int i = 0; i < array.length; i += 2) {

			if (array[i] < array[len] && i < len) {
				int temp = array[i];
				array[i] = array[len];
				array[len] = temp;
				len -= 2;
			}

		}

		System.out.println(Arrays.toString(array));

	}

}
