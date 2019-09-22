package com.problems.arrays;

import java.util.ArrayList;
import java.util.Arrays;

class Solution1 {

	static void mains(int[] num1, int[] num2) {

		int total = num1.length + num2.length;

		int[] temp = new int[total];

		System.arraycopy(num1, 0, temp, 0, num1.length);
		System.arraycopy(num2, 0, temp, num1.length, num2.length);

		Arrays.sort(temp);

		System.out.println(Arrays.toString(temp));

		double median = (temp.length + 1) / 2;
		int length = temp.length;
		System.out.println("Length: " + length);

		System.out.println("Median: " + median);

	}

}

public class FindMedianSortedArrays {

	public static void main(String[] args) {

		int[] nums1 = { 1, 2 };
		int[] nums2 = { 3, 4 };

		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList("Ram", "Kumar", "Aditi"));
		System.out.println(arrayList);

		System.out.println("-------------------------------------------------------------------------");

		String str = "This is HP laptop";
		String[] split = str.split(" ");

		for (String string : split) {
			System.out.println(string);
		}
		System.out.println("*****************************************************************************");
		String infoview = "INFOVIEW";

		//System.out.println(infoview.substring(1));
		for (int i = 0; i < infoview.length(); i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print(infoview.charAt(j));
			}
			System.out.println();
		}
		
		System.out.println("*****************************************************************************");

		Solution1.mains(nums1, nums2);

	}
}
