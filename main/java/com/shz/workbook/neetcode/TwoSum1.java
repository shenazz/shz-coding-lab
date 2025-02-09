package com.shz.workbook.neetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shenazz
 */
public class TwoSum1 {

	public static void main(String[] args) {
		int[] result = TwoSum1.twoSum(new int[] { 3, 4, 5, 6 }, 10);
		System.out.print(result[0] + " ");
		System.out.println(result[1]);

		result = TwoSum1.twoSum(new int[] { 3, 4, 5, 6 }, 11);
		System.out.print(result[0] + " ");
		System.out.println(result[1]);

		result = TwoSum1.twoSum(new int[] { 5, 5 }, 10);
		System.out.print(result[0] + " ");
		System.out.println(result[1]);
	}

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> tracker = new HashMap<>();

		for (int currentIndex = 0; currentIndex < nums.length; currentIndex++) {
			int currentValue = nums[currentIndex];
			int diff = target - currentValue;
			Integer firstIndex = tracker.get(diff);
			if (firstIndex != null && firstIndex != currentIndex) {
				return new int[] { firstIndex, currentIndex };
			} else {
				tracker.put(currentValue, currentIndex);
			}
		}

		return new int[] { 0 };
	}

}
