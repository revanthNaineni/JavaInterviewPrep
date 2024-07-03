package exceptions;

import java.util.Scanner;

public class TryWithResources {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			int age = scanner.nextInt();
			System.out.println(age);

		} catch (Exception e) {
			e.printStackTrace();
		}

		
		Scanner scanner1 = new Scanner(System.in);
		try {
			
			int age2 = scanner1.nextInt();
			System.out.println(age2);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner1.close();
		}

	}

}
