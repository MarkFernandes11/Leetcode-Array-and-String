package com.practice.lc.introtostring;

public class AddBinary {

	public static void main(String[] args) {
		
		String a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
		String b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
		
		String result = addBinary(a, b);
		System.out.println(result);
	}
	
    public static String addBinary(String a, String b) {
    	int num1 = getDecimalValue(a); 
    	int num2 = getDecimalValue(b);
    	
    	return Integer.toBinaryString(num1 + num2);
    }
    
    private static int getDecimalValue(String num) {
    	int value = 0;
    	
    	for(int i = num.length() - 1, pow = 0; i >= 0; i--, pow++) {
    		value += Character.getNumericValue(num.charAt(i)) * Math.pow(2, pow); 
    	}

    	return value;
    }  

    
}
