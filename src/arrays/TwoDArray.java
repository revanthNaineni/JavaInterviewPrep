package arrays;

public class TwoDArray {

	public static void main(String[] args) {
		int arr [][]=new int[4][3];
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j]=(int)( Math.random()*10);
			}
		}
		for(int row[]:arr) {
			for (int n : row) {
				System.out.print(n+" ");
			}
			System.out.println();
		}
		
		System.out.println(arr[3][2]);
	

	}

}
