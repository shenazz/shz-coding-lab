/**
 * 
 */
package com.shz.workbook.algo;

/**
 * @author shenazz
 */
public class SelectionSort {

	public static void main(String[] args) {
		SelectionSort selectionSort = new SelectionSort();
		int[] input = new int[] { 5, 1, 4, 2, 3 };
		selectionSort.sort(input);
		for (int i : input) {
			System.out.print(i + " ");
		}
	}

	public void sort(int[] input) {
		for (int i = 0; i < input.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < input.length; j++) {
				if (input[j] < input[minIndex]) {
					minIndex = j;
				}
			}

			if (i != minIndex) {
				int current = input[i];
				int min = input[minIndex];
				input[i] = min;
				input[minIndex] = current;
			}
		}
	}
}
