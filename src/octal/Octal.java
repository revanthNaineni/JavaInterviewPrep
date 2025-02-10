package octal;

public class Octal {

	public static void main(String[] args) {
		System.out.println(01);
		System.out.println(02);
		System.out.println(03);
		System.out.println(04);
		System.out.println(05);
		System.out.println(06);
		System.out.println(07);
		//System.out.println(08);
		//System.out.println(09);
		System.out.println(010);
		System.out.println(011);
		System.out.println(012);
		System.out.println(013);
		System.out.println(014);
		System.out.println(015);
		System.out.println(016);
		System.out.println(017);
		//System.out.println(018);
		//System.out.println(019);
		System.out.println(020);
		System.out.println(021);
		System.out.println(022);
		System.out.println(023);
		System.out.println(024);
		System.out.println(025);
		System.out.println(026);
		System.out.println(027);
		//System.out.println(028);
		//System.out.println(029);
		System.out.println(030);
		System.out.println(031);
		System.out.println(032);
		System.out.println(00073);
		
		
		//int a=018;
		
		System.out.println(01.2);
		System.out.println(01.8);
		System.out.println(088888.2);
		System.out.println(071);
		System.out.println(079);
		System.out.println(07123458);
		System.out.println(01234T);
		
		System.out.println(012 + 3); // Output: 13 (Octal 012 + Decimal 3)
		System.out.println(012 - 3);
		System.out.println("Value: " + 012); // Output: Value: 10

		int b=000012344567;  //No error
		//int c=0000123445678; //Compilation error
		
		System.out.println(012 + 10); // Output: 20 (Octal 012 + Decimal 10)
		System.out.println(012 + 0x10); // Output: 26 (Octal 012 + Hexadecimal 10)

		
		System.out.println(012 * 2); // Output: 20 (Octal 012 * Decimal 2)
		System.out.println(012 / 3); // Output: 4 (Octal 012 / Decimal 3)

		System.out.println(012 * 012); // Output: 20 (Octal 012 * Decimal 2)
		System.out.println(012 / 012);
		
		System.out.println("New\nLine"); // Output: New (on a new line) Line
		System.out.println("\012New Line");
		
		System.out.println(8);
		System.out.println(9);
	}

}
