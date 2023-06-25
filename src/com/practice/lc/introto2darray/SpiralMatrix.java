package com.practice.lc.introto2darray;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
	
	public static void main(String[] args) {
		int[][] mat = {{1,2,3}, {4,5,6}, {7,8,9}};
		List<Integer> result = spiralOrder(mat);

		System.out.println(result);
	}
	
    public static List<Integer> spiralOrder(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int row = 0, col = 0;
        int leftLimit = 0, rightLimit = cols - 1;
        int topLimit = 0, bottomLimit = rows - 1;
        boolean up = false, right = true; 
        
    	List<Integer> result = new ArrayList<Integer>(cols*rows);
        
    	for (int i = 0; i < cols*rows; i++) {
			result.add(matrix[row][col]);
			
			// Move right
			if(col <= rightLimit && right) {
				if(col == rightLimit) {
					rightLimit--;
					up = false;
					right = false;
				} else {
					col++;
				}
			}
			
			// Move bottom
			else if(row <= bottomLimit && !up) {
				if(row == bottomLimit) {
					bottomLimit--;
					up = true;
					right = false;
				} else {
					row++;
				}
				
			}
			
			// Move left
			else if(col >= leftLimit && !right) {
				if(col == leftLimit) {
					leftLimit++;
					up = true;
					right = false;
				} else {
					col--;
				}
			}
			
			// Move top
			else if(row >= topLimit && up) {
				if(row == topLimit) {
					topLimit++;
					right = true;
					up = false;
				} else {
					row--;
				}
			}
			
//			else if(col == rightLimit) rightLimit--;
//			else if(row == bottomLimit) bottomLimit--;
//			else if(col == leftLimit) leftLimit++;
//			else if(row == topLimit) topLimit++;
		}
        
    	return result;
    }	

}
