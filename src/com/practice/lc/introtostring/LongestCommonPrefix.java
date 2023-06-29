package com.practice.lc.introtostring;

import java.util.Arrays;

public class LongestCommonPrefix {
	
	public static void main(String[] args) {
		String[] arr = {"flower","flow","flight"};
		String result = longestCommonPrefix(arr);
		
		System.out.println(result);
	}
	
    // Leetcode solution
    public static String longestCommonPrefix(String[] strs) {
    	if(strs == null || strs.length == 0) return "";
    	
    	if(strs.length == 1) return strs[0];
    	
    	// If the array is sorted all string would be in lexographical order 
    	// i.e. If last element has common prefix we will have to check else it would be an empty string
    	Arrays.sort(strs);
    	String shortest = strs[0];
    	String longest = strs[strs.length-1];
    	int index = 0;
    	
    	while(index < shortest.length() && index < longest.length()) {
    		if(shortest.charAt(index) == longest.charAt(index)) 
    			index++;
    		else
    			break;
    	}
    	
    	return longest.substring(0, index);
    }

	// My Implementation
    public static String longestCommonPrefix1(String[] strs) {
    	StringBuilder result = new StringBuilder();
        
    	if(strs == null || strs.length == 0) return "";
    	
    	if(strs.length == 1) return strs[0];
    	
    	int index = 0;
    	String shortestWord = strs[0];
    	
    	for (int i = 1; i < strs.length; i++) {
			if(strs[i].length() < shortestWord.length()) {
				shortestWord = strs[i];
				index = i;
			}
		}
    	
    	for (int i = 0; i < shortestWord.length(); i++) {
			boolean isPrefix = true;
			char ch = shortestWord.charAt(i);
			
			for (int j = 0; j < strs.length; j++) {
				if(j == index) continue;
				
				if(ch != strs[j].charAt(i)) {
					isPrefix = false;
					break;
				}
			}
			
			if(isPrefix) result.append(ch);
			else break;
		}
    	
    	return result.toString();
    }
    
}
