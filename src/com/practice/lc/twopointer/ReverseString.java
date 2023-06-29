package com.practice.lc.twopointer;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		char[] arr = {'h', 'e', 'l', 'l', 'o'};
		reverseString(arr);
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void reverseString(char[] s) {
		int start = 0;
		int end = s.length - 1;
		
		while(start < end) {
			swap(s, start, end);
			start++;
			end--;
		}
	}
	
    private static void swap(char[] s, int start, int end) {
		char temp = s[start];
		s[start] = s[end];
		s[end] = temp;
    }

}
