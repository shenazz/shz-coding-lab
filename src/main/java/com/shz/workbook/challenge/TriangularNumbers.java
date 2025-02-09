/**
 * 
 */
package com.shz.workbook.challenge;

/**
 * @author shenazz
 */
public class TriangularNumbers {

	public static int solution1(int n) {
		int value = 0;
		for (int i = 1; i <= n; i++) {
			value += i;
		}

		return value;
	}

	public static int solution2(int n) {
		if (n == 1) {
			return 1;
		}
		return n + solution2(n - 1);
	}

}
