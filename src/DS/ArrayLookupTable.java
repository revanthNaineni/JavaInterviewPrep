package DS;

import java.math.MathContext;
import java.util.Arrays;
import java.util.Iterator;

/*Given an array of unique integers numbers, your task is to find the number of pairs of indices (i, j) such that i ≤ j and the sum numbers[i] + numbers[j] is equal to some power of 2.

Note: The numbers 20  = 1, 21 = 2, 22 = 4, 23 = 8, etc. are considered to be powers of 2.

Example

For numbers = [1, -1, 2, 3], the output should be solution(numbers) = 5.
– There is one pair of indices where the sum of the elements is 20 = 1:(1, 2): numbers[1] + numbers[2] = -1 + 2 = 1
– There are two pairs of indices where the sum of the elements is 21 = 2: (0, 0) and (1, 3)
– There are two pairs of indices where the sum of the elements is 22 = 4: (0, 3) and (2, 2)
– In total, there are 1 + 2 + 2 = 5 pairs summing to powers of 2.

For numbers = [2], the output should be solution(numbers) = 1.
– The only pair of indices is (0, 0) and the sum is equal to 22 = 4. So, the answer is 1.

For numbers = [-2, -1, 0, 1, 2], the output should be solution(numbers) = 5.
– There are two pairs of indices where the sum of the elements is 20 = 1: (2, 3) and (1, 4)
– There are two pairs of indices where the sum of the elements is 21 = 2: (2, 4) and (3, 3)
– There is one pair of indices where the sum of the elements is 22 = 4: (4, 4)
– In total, there are 2 + 2 + 1 = 5 pairs summing to powers of 2. 


8-2-4
16-2-4-8
Guaranteed constraints:

1 ≤ numbers.length ≤ 105
-106 ≤ numbers[i] ≤ 106*/
public class ArrayLookupTable {
	
	public static void main(String[] args) {
		int arr[] = { -2, -1, 0, 1, 2 };

		System.out.println(solution(arr));
	}

	private static int solution(int[] arr) {

		int total = Arrays.stream(arr).sum();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {

				if (i <= j) {

					int sum = arr[i] + arr[j];

					if (sum > 0) {
						if (isPowerOfTwo(sum)) {
							count++;
						}
					}

					//System.out.println(arr[i]+arr[j]);
				}

			}

		}
		return count;
	}
	
	public static boolean isPowerOfTwo(int num) {
		if (num <= 0) {
            return false;
        }
		
		

        while (num > 1) {
            if (num % 2 != 0) {
                return false;
            }
            num /= 2;
        }

        return true;
	}
	
	

}
