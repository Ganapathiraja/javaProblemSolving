package com.problem.arrays;

import java.util.Arrays;

public class T2DArrayFindTheSubString {

	public static void main(String[] args) {

		int[][] twoDarrayString = { { 'W', 'E', 'L', 'C' }, { 'O', 'M', 'E', 'M' }, { 'A', 'N', 'J', 'O' } };

		int rows = 3;
		int columns = 4;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print((char) twoDarrayString[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println(
				"==============================================================================================");
		System.out.println();

		String isPresent = "CMO";

		findSubStringPresent(isPresent, rows, columns, twoDarrayString);

	}

	private static void findSubStringPresent(String isPresent, int rows, int columns, int[][] twoDarrayString) {
		// TODO Auto-generated method stub

		for (int i = 0; i < rows; i++) {
			int isPresentLength = isPresent.length();
			int count = 0;
			for (int j = 0; j < columns; j++) {
				char ch = (char) twoDarrayString[i][j];
				if (count <= isPresentLength) {
					if (ch == isPresent.charAt(count)) {
						System.out.println("["+i+","+j+"]"); 
					}
				}

			}
			System.out.println();
		}

	}

}
