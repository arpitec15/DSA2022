package com.dsa22.arrays.window.fixed;

public class MaxSumSubArray {

	public static void main(String[] args) {

		int k = 3;
		int[] arr = { 2, 5, 1, 8, 2, 9, 1 };
		maxSumSubArray(arr, k);
	}

	private static void maxSumSubArray(int[] arr, int k) {

		int i = 0;
		int j = 0;
		int sum = 0;
		int max_so_far = 0;
		int size = arr.length;
		
		while(j<size) {
			
			if(j-i+1 == k) {
				sum += arr[j];
				max_so_far = Math.max(max_so_far, sum);
				sum -= arr[i];
				i++;
				j++;
			}
			else {
				sum += arr[j];
				j++;
			}
		}
		
		System.out.println(max_so_far);
	}

}
