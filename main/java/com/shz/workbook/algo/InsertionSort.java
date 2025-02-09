/**
* 
*/
package com.shz.workbook.algo;

/**
 * @author shenazz
 */
public class InsertionSort {

	public static void main(String[] args) {
		InsertionSort selectionSort = new InsertionSort();
		int[] input = new int[] { 2, 3, 4, 5, 1 };
		selectionSort.sort2(input);
		for (int i : input) {
			System.out.print(i + " ");
		}
	}

	// This is what I wrote
	public void sort(int[] input) {
		for (int i = 1; i < input.length; i++) {
			int current = input[i];
			int indexToMoveCurrent = i;
			for (int j = i - 1; j >= 0; j--) {
				if (input[j] > current) {
					input[j + 1] = input[j];
					indexToMoveCurrent = j;
				} else {
					break;
				}
			}
			if (indexToMoveCurrent != i) {
				input[indexToMoveCurrent] = current;
			}
		}
	}

	// This is the optimized version
	public void sort2(int[] input) {
		for (int i = 1; i < input.length; i++) {
			int current = input[i];
			int j = i - 1;

			while (j >= 0 && input[j] > current) {
				input[j + 1] = input[j];
				j--;
			}

			input[j + 1] = current;

		}
	}
}
