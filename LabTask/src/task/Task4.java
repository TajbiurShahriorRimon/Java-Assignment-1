package task;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		System.out.println("Enter the first Number: ");
		Scanner input = new Scanner(System.in);
		float num1 = input.nextFloat();
		
		System.out.println("Enter the second Number: ");
		Scanner input2 = new Scanner(System.in);
		float num2 = input.nextFloat();
		
		System.out.println("Enter the third Number: ");
		Scanner input3 = new Scanner(System.in);
		float num3 = input.nextFloat();
		
		if(num1 > num2) {
			if(num1 > num3) {
				System.out.println("First number is the largest number");
			}
			else {
				System.out.println("Third number is the largest number");
			}
		}
		else if(num2 > num3) {
			System.out.println("Second number is the largest number");
		}
		else {
			System.out.println("Third number is the largest number");
		}
	}
}