package com.practice.lc.introto2darray;

import java.util.Arrays;

public class DiagonalTraverse {
	
	public static void main(String[] args) {
		int[][] mat = {{1,2,3}, {4,5,6}, {7,8,9}};
		int[] result = findDiagonalOrder(mat);

		System.out.println(Arrays.toString(result));
	}

    public static int[] findDiagonalOrder(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int row = 0, col = 0;
        
        int[] result = new int[rows * cols];

        for (int i = 0; i < result.length; i++) {
        	result[i] = mat[row][col];
        	
        	// For even it will always go up and for odd down
        	if((row + col) % 2 == 0) {
        		if(col == cols - 1) row++;
        		else if(row == 0 && (col + 1 < cols)) col++;
        		else {
        			row--;
        			col++;
        		}
        	} else {
        		if(row == rows - 1) col++;
        		else if(col == 0 && (row + 1 < rows)) row++;
        		else {
        			row++;
        			col--;
        		}
        	}        	
		}
    	
    	return result;
    }
}
