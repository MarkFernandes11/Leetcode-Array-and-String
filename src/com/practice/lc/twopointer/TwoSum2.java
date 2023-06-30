package com.practice.lc.twopointer;

import java.util.Arrays;

public class TwoSum2 {

	public static void main(String[] args) {
//		int[] nums = {2,7,11,15, 16, 18};
		int[] nums = {-1000, 1, 1000};
		int target = -999;

		int[] result = twoSum(nums, target);		
		System.out.println(Arrays.toString(result));
	}

    public static int[] twoSum(int[] numbers, int target) {
    	if(numbers == null || numbers.length == 0) return new int[]{};
    	
    	if(numbers.length == 2) return new int[] {1, 2}; 
    	
        int leftPointer = 0;
        int rightPointer = numbers.length - 1;
        
        while(leftPointer < rightPointer) {
        	int sum = numbers[leftPointer] + numbers[rightPointer]; 
        	if(sum == target) break;

        	if(sum > target) rightPointer--;
        	else leftPointer++;
        }
        
        return new int[] {leftPointer + 1, rightPointer + 1};
    }
}
