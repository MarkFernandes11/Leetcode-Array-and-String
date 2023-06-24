package com.practice.lc.intotoarray;

public class LargestNumberAtLeastTwice {
	
	public static void main(String[] args) {
		int[] nums = { 1,2,3,4 };
		int result = dominantIndex(nums);
		
		System.out.println(result);
	}
	
    public static int dominantIndex(int[] nums) {
        int index = -1;
        int max = -1;
        
        for (int i = 0; i < nums.length; i++) {
			if(nums[i] > max) {
				max = nums[i];
				index = i;
			}
		}
        
        for (int i = 0; i < nums.length; i++) {
			if(index == i) continue;
			
			if(max < 2 * nums[i]) {
				index = -1;
				break;
			}
		}
    	
    	return index; 
    }	

}
