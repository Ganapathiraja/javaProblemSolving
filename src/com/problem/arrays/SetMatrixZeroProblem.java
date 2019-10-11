package com.problem.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMatrixZeroProblem {
	public static void main(String[] args) {

		int[][] matrix = { { 1, 2, 3 }, { 4, 0, 6 }, { 5, 1, 2 } };

		System.out.println("Original Matrix");

		for (int[] matr : matrix)
			System.out.println(Arrays.toString(matr));

		int row = matrix.length;
		int column = matrix[0].length;

		Set<Integer> rowSet = new HashSet<Integer>();
		Set<Integer> columnSet = new HashSet<Integer>();

		System.out.println("The row is " + row);
		System.out.println("The column is " + column);

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (matrix[i][j] == 0) {
					rowSet.add(i);
					columnSet.add(j);

				}

			}
		}

		// updating the elements:
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (rowSet.contains(i) || columnSet.contains(j)) {
					matrix[i][j] = 0;
				}

			}
		}

		System.out.println("Output: ");
		for (int[] mat : matrix) {
			System.out.println(Arrays.toString(mat));
		}

	}

}
