package com.practice.lc.introtostring;

public class ImplementStrStr {

	public static void main(String[] args) {
		String haystack = "mississippi";
		String needle = "issip";

		int result = strStr(haystack, needle);
		System.out.println(result);
	}

	// Using inbuilt function
	public static int strStr(String haystack, String needle) {
		if (needle == null || haystack == null || haystack.length() == 0)
			return -1;
		
		if(needle.length() == 0) return 0;

		return haystack.indexOf(needle);
	}

	public static int strStr2(String haystack, String needle) {
		for (int i = 0;; i++) { // Haystack loop
			for (int j = 0;; j++) { // Needle loop
				if (j == needle.length())
					return i;
				if (i + j == haystack.length())
					return -1;
				if (needle.charAt(j) != haystack.charAt(i + j))
					break;
			}
		}
	}

}
