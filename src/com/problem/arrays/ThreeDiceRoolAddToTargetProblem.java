package com.problem.arrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class ThreeDiceRoolAddToTargetProblem {
	public static void main(String[] args) {

		// Solution 1

		int d = 2, f = 6, target = 6;

		int[][] dp = new int[d + 1][target + 1];
		int modulo = 1_000_000_007;
		dp[0][0] = 1;
		for (int i = 1; i <= d; i++) {
			for (int j = 1; j <= target; j++) {
				for (int k = 1; k <= f && k <= j; k++) {
					dp[i][j] = (dp[i][j] + dp[i - 1][j - k]) % modulo;
				}
			}
		}

		System.out.println(dp[d][target]);

		// solution 2

		int[] counts = new int[18];
		// Dice 1.

		Map<String, Integer> map = new LinkedHashMap<String, Integer>();

		for (int k = 1; k <= 6; k++) {
			// Dice 2.
			for (int i = 1; i <= 6; i++) {
				// Dice 3.
				for (int j = 1; j <= 6; j++) {
					// Count their sum (-1 as noted above).
					map.put(i + "," + j + "," + k, i + j + k);
				}
			}
		}

		Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

		boolean isKeyPresent = false;
		int findMe = 10;
		int total =0;
		// Iterate over the HashMap
		while (iterator.hasNext()) {

			// Get the entry at this iteration
			Map.Entry<String, Integer> entry = iterator.next();

			// Check if this key is the required key
			if (findMe >= 3) {
				if (findMe == entry.getValue()) {
					isKeyPresent = true;
					System.out.println(entry.getKey() + " =======> " + entry.getValue());
					total++;
				}
			} else {
				System.out.println("Not available");
				break ;
			}
		}
		System.out.println("The findMe is "+findMe+" posibility count is "+total);

	}

}
