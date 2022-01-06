package com.dsa22.arrays.window.fixed;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNegativeIntegerOfSizeK {

	public static void main(String[] args) {

		int k = 2;
//		int[] arr = { 12, -1, -7, 8, -15, 30, 16, 28 };
//		int[] arr = { 10, -1, -5, 7, -15, 20, 18, 24 };
		int[] arr = { -5, 1, 2, -6, 9 };

		firstNegativeInteger(arr, k);
	}

	private static void firstNegativeInteger(int[] arr, int k) {

		int i = 0;
		int j = 0;
		int neg_index = Integer.MIN_VALUE;
		int size = arr.length;
		Queue<Integer> queue = new LinkedList<>();

		while (j < size) {

			if (arr[j] < 0) {
				queue.add(j);
			}

			if (j - i + 1 == k) {
				if (!queue.isEmpty())
					System.out.print(arr[queue.peek()] + " ");
				else
					System.out.print("0" + " ");

				i++;
				j++;
				if (!queue.isEmpty() && i > queue.peek()) {
					queue.poll();
				}
			}

			else {
				j++;
			}

		}

	}

}
