package com.practice.lc.introto2darray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {
	
	public static void main(String[] args) {
		int numRows = 5;
		List<List<Integer>> result = generate(numRows);
		
		System.out.println(result);
	}

    public static List<List<Integer>> generate(int numRows) {
    	if(numRows == 0) return new ArrayList<>();

    	List<List<Integer>> result = new ArrayList<>();
    	
    	for (int i = 0; i < numRows; i++) {
    		List<Integer> row = new ArrayList<>();
			if(i == 0) row = Arrays.asList(1);
			else if(i == 1) row = Arrays.asList(1, 1);
			else {
				row.add(1);
				for (int j = 1; j < i; j++) {
					int iPos = result.get(i-1).get(j);
					int iMinus1Pos = result.get(i-1).get(j-1);
					row.add(iMinus1Pos + iPos);
				}
				row.add(1);
			}
			
			result.add(row);
		}
    	
    	return result;
    }
}
