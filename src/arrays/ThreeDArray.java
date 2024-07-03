package arrays;

public class ThreeDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][][] = new int[5][4][3];
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[0][0].length);
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int j2 = 0; j2 <arr[j][j2].length; j2++) {
					arr[i][j][j2] = (int) (Math.random() * 10);

				}
			}
		}

		for (int[][] row : arr) {
			for (int n[] : row) {
				for (int num : n)
					System.out.print(num + " ");
				System.out.print("  ");
			}
			System.out.println();
		}

	}

}
