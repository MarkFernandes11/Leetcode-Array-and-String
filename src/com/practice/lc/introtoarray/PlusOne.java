package com.practice.lc.introtoarray;

import java.util.Arrays;

public class PlusOne {
	
	public static void main(String[] args) {
		int[] digits = { 9,9 };
		int[] result = plusOne(digits);
		
		System.out.println(Arrays.toString(result));
	}
	
    public static int[] plusOne(int[] digits) {
        boolean allNines = true;
        
        for (int num : digits) {
			if(num != 9) {
				allNines = false;
				break;
			}
		}
        
        if(allNines) {
        	int[] result = new int[digits.length + 1];
        	result[0] = 1;
        	
        	return result;
        }
        
        for (int i = digits.length - 1; i >= 0; i--) {
			if(digits[i] < 9) {
				digits[i] = digits[i] + 1;
				break;
			} else {
				digits[i] = 0;
			}
		}
    	
    	return digits;
    }

}
