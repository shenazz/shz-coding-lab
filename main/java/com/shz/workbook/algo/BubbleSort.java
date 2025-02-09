/**
 * 
 */
package com.shz.workbook.algo;

/**
 * @author shenazz
 */
public class BubbleSort {

	public static void main(String[] args) {
		BubbleSort selectionSort = new BubbleSort();
		int[] input = new int[] { 2, 3, 4, 5, 1 };
		selectionSort.sort(input);
		for (int i : input) {
			System.out.print(i + " ");
		}
	}

	public void sort(int[] input) {
		for (int i = 0; i < input.length; i++) {
			boolean swapped = false;
			for (int j = 1; j < input.length - i; j++) {
				int previous = input[j - 1];
				int current = input[j];
				if (previous > current) {
					input[j - 1] = current;
					input[j] = previous;
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}

		}
	}
}
