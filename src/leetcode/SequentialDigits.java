package leetcode;

import java.util.ArrayList;
import java.util.List;

//Input: low=100 and high=300
//output: 123, 234
public class SequentialDigits {

	public static void main(String[] args) {
		System.out.println(sequentialDigits(100, 300));

	}
	
	public static List<Integer> sequentialDigits(int low, int high) {
		
		List<Integer> list=new ArrayList<Integer>();
		for (int i = 1; i <=9; i++) {
			int num=i;
			int nextDigit=i+1;
			
			while (num<=low && nextDigit<=9) {
				num=num*10+nextDigit;
				if(low<=num && num<=high) {
					list.add(num);
				}
				nextDigit++;
			}
			
		}
		
		
		return list;
	}

}
