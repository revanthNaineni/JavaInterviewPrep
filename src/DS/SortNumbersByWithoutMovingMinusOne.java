package DS;

public class SortNumbersByWithoutMovingMinusOne {

	public static void main(String[] args) {
		
		
	int arr [] = {-1,150,190,170,-1,-1,160,180,-1,1}; 
	
	for (int i = 0; i < arr.length; i++) {
		for (int j = i+1; j < arr.length; j++) {
			
			if(arr[i]!=-1 && arr[j]!=-1 && arr[i]>arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
		}
	}
	
	for (int i : arr) {
		System.out.println(i);
	}

	}

}
