package com.shz.workbook.neetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shenazz
 */
public class TwoSum2 {

	public static void main(String[] args) {
		int[] result = TwoSum2.twoSum(new int[] { 3, 4, 5, 6 }, 10);
		System.out.print(result[0] + " ");
		System.out.println(result[1]);

		result = TwoSum2.twoSum(new int[] { 3, 4, 5, 6 }, 11);
		System.out.print(result[0] + " ");
		System.out.println(result[1]);

		
		result = TwoSum2.twoSum(new int[] { 5, 5 }, 10);
		System.out.print(result[0] + " ");
		System.out.println(result[1]);
	}

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> tracker = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			tracker.put(nums[i], i);
		}

		for (int firstIndex = 0; firstIndex < nums.length; firstIndex++) {
			int currentValue = nums[firstIndex];
			int diff = target - currentValue;
			Integer secondIndex = tracker.get(diff);
			if (secondIndex != null && secondIndex != firstIndex) {
				return new int[] { firstIndex, secondIndex };
			}
		}

		return new int[] { 0 };
	}

}
