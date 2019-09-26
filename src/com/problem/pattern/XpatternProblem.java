package com.problem.pattern;

public class XpatternProblem {

	public static void main(String[] args) {
		
		
		String str = "geeksforgeeks";
		
		
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<str.length();j++) {
				if(i==j || i+j == str.length()-1) {
					System.out.print(str.charAt(j));
				}
				else {
					System.out.print(" ");
				}
					
			}
			System.out.println();
		}
		
	}
}
