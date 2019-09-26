package com.problems.strings;

//OUTPUT:

/*
 
1     5
 2   4
   3
 2   4
1     5

*/

public class xPattern {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (i == j) {
					System.out.print(j);
				} else if (i + j == 9) {
					System.out.print(j);
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();

		}

	}
}
