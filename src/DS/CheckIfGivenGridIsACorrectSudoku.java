package DS;

import java.util.Iterator;

/*
2 | 3 | 4 | 1
5 | 1 | 2 | 4
7 | 4 | 1 | 3
1 | 2 | 3 | 5
*/

public class CheckIfGivenGridIsACorrectSudoku {

	public static void main(String[] args) {

		int arr[][] = {
				{2,3,4,1},{5,1,2,4},{7,4,1,3},{1,2,3,5}
			};
		
		 boolean sudoku = isSudokuRow(arr);
		 isSudokuColumn(arr);
		 //System.out.println(sudoku);
		 if(isSudokuColumn(arr) && isSudokuRow(arr)) {
			 System.out.println("true");
		 }else {
			 System.out.println("false");
		 }

	}

	private static boolean isSudokuRow(int[][] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			
			for (int j = 0; j < arr.length-1; j++) {
				
				for (int k = j+1; k < arr.length; k++) {
					/*
					 * if(arr[i][j]!=arr[i][k] && arr[i][j]!=arr[k-j][i+j]) {
					 * 
					 * }else { return false; }
					 */
					if(arr[i][j]!=arr[i][k]) {
						
					}else { return false; }
					
					//System.out.println((k-j)+":"+(i+j));
				}
				
			}
			
		}
		return true;
	}
	
	/*
	 * int arr[][] = { {1, 6, 4, 5, 3, 2}, {5, 3, 2, 6, 4, 1}, {6, 4, 2, 1, 3, 5},
	 * {3, 2, 1, 4, 6, 5}, {4, 5, 6, 3, 1, 2}, {2, 1, 3, 5, 6, 4} };
	 */
	
	private static boolean isSudokuColumn(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr.length; j++) {
				
				for (int k =1; k < arr.length; k++) {
					
					
					if (arr[i][j] != arr[k][j]) {

					} else {
						return false;
					}
					 
					 

					//System.out.println((k)+":"+(j));
				}
				
			}
			
		}
		return true;
	}

}
