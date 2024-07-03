package DS;

//findsum
//Ignore if element is zero and below zero 
public class Matrix {

	public static void main(String[] args) {
		
		int arr[][]= {{0,1,1,2,4},{0,5,0,0,0},{2,0,3,3,11},{2,0,3,3,11}};
		
		//{0,1,1,2,4}
		//{0,5,0,0,0}
		//{2,0,3,3,11}
		//{2,0,3,3,11}
		int sum=0;
		for (int i = arr.length-1; i>=0 ; i--) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j]!=0 && i==0) {
					sum+=arr[i][j];
				}else if(arr[i][j]!=0 && arr[i-1][j]!=0) {
					sum+=arr[i][j];
				}
			}
		}
		
		System.out.println(sum);
		

	}

}
