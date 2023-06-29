package com.practice.lc.introtostring;

public class AddBinary {

	public static void main(String[] args) {
		
//		String a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
//		String b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
		
		String a = "11";
		String b = 	 "1";
		
		String result = addBinary(a, b);
		System.out.println(result);
	}
	
	public static String addBinary(String a, String b) {
		StringBuilder result = new StringBuilder();
		int sum = 0, carry = 0;
		int indexA = a.length() - 1, indexB = b.length() - 1;

		while(indexA >= 0 || indexB >= 0) {
			Integer digitA = (indexA >= 0) ? Character.getNumericValue(a.charAt(indexA)) : 0;
			Integer digitB = (indexB >= 0) ? Character.getNumericValue(b.charAt(indexB)) : 0;
			
			sum = carry + digitA + digitB;
			
			if(sum == 3 || sum == 2) {
				carry = 1;
				sum = (sum == 2) ? 0 : 1;
			} else {
				carry =  0;
			}
			
			result.append(sum);
			
			indexA--;
			indexB--;
		}
		
		if(carry == 1) result.append(carry);
		
		return result.reverse().toString();
	}
    
}
