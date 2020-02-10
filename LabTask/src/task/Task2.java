package task;
import java.util.Scanner;
public class Task2 {
	public static void main(String[] args) {
		System.out.println("Enter the Amount: ");
		Scanner input = new Scanner(System.in);
		double amount = input.nextDouble();
		double tax = amount * 0.15;
		
		System.out.println("Tax Amount: " +tax);
	}
}
