package collections;

public class QHashMapCodingQuestion {
	
	

	public static void main(String[] args) {
		int arr[]= {3,-1,8,111,2,14,-15};
		int target=5;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j =i+1; j < arr.length; j++) {
				int sum=0;
				sum=arr[i]+arr[j];
				if(sum==target) {
					System.out.println(arr[i]+" : "+arr[j]);
					System.out.println(i+" : "+j);
				}
			}
			
		}
	}

}
