package com.problems.strings;

public class reverseInduvidualStrings {
	public static void main(String[] args) {

		String str = "one two three";
		String[] splitStrings = str.split(" ");

		System.out.println("Original String: \n" + str);

		System.out.println();

		System.out.println("Output String");
		for (int i = splitStrings.length - 1; i >= 0; i--) {
			System.out.print(splitStrings[i] + " ");
		}

	}

}
