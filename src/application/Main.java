package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number to calculate the dividers: ");
		int number = scanner.nextInt();
		for (int i = 1; i <= number; i++) {
			if(number != 0 && number % i == 0) {
				System.out.println(i);
			}
		}
		
		scanner.close();
		
	}

}
