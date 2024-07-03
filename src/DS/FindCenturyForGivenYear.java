package DS;

import java.util.Scanner;

public class FindCenturyForGivenYear {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int year=scanner.nextInt();
		
		System.out.println(centuryFromYear(year));

	}

	private static int centuryFromYear(int year) {
		int century = 0;
		
		if(year%100==0) {
			century=year/100;
		}else {
			century=year/100+1;
		}
		
		return century;
	}

}
