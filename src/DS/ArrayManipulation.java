package DS;


/*Given an array a, your task is to output an array b of the same length by applying the following transformation: 
– For each i from 0 to a.length - 1 inclusive, b[i] = a[i - 1] + a[i] + a[i + 1]
– If an element in the sum a[i - 1] + a[i] + a[i + 1] does not exist, use 0 in its place
– For instance, b[0] = 0 + a[0] + a[1]

Example

For a = [4, 0, 1, -2, 3]: 
– b[0] = 0 + a[0] + a[1] = 0 + 4 + 0 = 4
– b[1] = a[0] + a[1] + a[2] = 4 + 0 + 1 = 5
– b[2] = a[1] + a[2] + a[3] = 0 + 1 + (-2) = -1
– b[3] = a[2] + a[3] + a[4] = 1 + (-2) + 3 = 2
– b[4] = a[3] + a[4] + 0 = (-2) + 3 + 0 = 1

So, the output should be solution(a) = [4, 5, -1, 2, 1].*/

public class ArrayManipulation {
	
	public static void main(String[] args) {
		
		int a []= {4, 0, 1, -2, 3};
		
		int b []=new int[5];
		int first=0;
		int last=0;
		for (int i = 0; i <= a.length-1; i++) {

			if (i < 1) {
				first = 0;
			} else {
				first = a[i - 1];
			}

			int mid = a[i];

			if(i+1>=a.length) {
				last=0;
			}else {
			last = a[i + 1];
			}

			b[i] = first + mid + last;

		}
		
		for (int i : b) {
			System.out.println(i);
		}
		
		
	}
	
	
	

}
