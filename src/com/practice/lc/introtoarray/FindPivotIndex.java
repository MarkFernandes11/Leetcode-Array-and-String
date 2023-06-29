package com.practice.lc.introtoarray;

import java.util.Arrays;

public class FindPivotIndex {
	
	public static void main(String[] args) {
		int[] nums = { 1,7,3,6,5,6 };
		int result = pivotIndex(nums);
		
		System.out.println(result);
	}

    public static int pivotIndex(int[] nums) {
    	int index = 0;
        int sumLeft = 0;
    	int sumRight = Arrays.stream(nums).sum() - nums[index];
    	
    	while(index < nums.length) {
    		
    		if(sumLeft == sumRight) {
    			break;
    		} else {
    			sumLeft += nums[index];    			
    			sumRight = (index+1 < nums.length) ? sumRight - nums[index+1] : 0;  
    		}
    		
    		index++;
    	}
        
    	return (sumLeft == sumRight && index < nums.length) ? index : -1;
    }
    
}
