package com.revature.tier1;

public class NumberSumLength {

	public static boolean checkNumberPowerLength(long num) {
int sum = 0;
		String numString = Long.toString(num);
		for (int i = 0; i < numString.length(); i++) {
			sum += (numString.charAt(i)*numString.length());
		}
		

		return (sum == num);
	}
}
