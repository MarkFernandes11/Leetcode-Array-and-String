package com.practice.lc.twopointer;

import java.util.Arrays;

public class ArrayPartition1 {
	
	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		
		int result = arrayPairSum(nums);		
		System.out.println(result);
	}

	// Intuition
    public static int arrayPairSum1(int[] nums) {
    	int sum = 0;
        Arrays.sort(nums);
    	
        for (int i = 0; i < nums.length; i+=2) {
			sum += nums[i];
		}
        
    	return sum;
    }
    
    // O(n) Time complexity solution
    public static int arrayPairSum(int[] nums) {
    	int maxElements = 10000;
    	
    	// Initializing array with max size and default values as 0
    	int[] elements = new int[2 * maxElements + 1];
    	for (int i = 0; i < nums.length; i++) {
    		elements[nums[i] + maxElements]++;
		}

    	int sum = 0;
    	boolean isOdd = true;
    	for (int i = 0; i < elements.length; i++) {
    		
			// Everytime a number is found in elements[] we enter inside the while loop
			while(elements[i] > 0) {
				// If number is odd we are adding it to sum and then switching the flag to even 
				// and in case of even we are only setting the flag to odd 
				// and at last decrementing from 1 to 0 to break while loop
				sum += isOdd ? i - maxElements : 0; 
				isOdd = !isOdd;
				elements[i]--;
			}
		}
        
    	return sum;
    }
    
}
