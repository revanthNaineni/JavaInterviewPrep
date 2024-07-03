package javaInterviewQs;

public class Test {

	public static void main(String[] args) {

		int arr[] = { 88, 1, 4, 8, -1, 22, 46, 13 };
		int n=3;
		
		int last=arr[0];
		for (int i = 0; i < arr.length-1; i++) {
			arr[i]=arr[i+1];
		}
		
		arr[arr.length-1]=last;
		
		for (int i : arr) {
			System.out.println(i);
		}


	}
	

}
