package task;

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		System.out.println("Enter the Number of elements: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int ara[] = new int[num];
		int i;
		System.out.println("Enter the Numbers: ");
		for(i = 0; i < num; i++) {
			ara[i] = input.nextInt();
		}
		
		int sig = 0;
		System.out.println("enter the number you want to search: ");
		int s = input.nextInt();
		for(i = 0; i < num; i++) {
			if(ara[i] == s) {
				System.out.println("Found! The number is: " +s);
				sig = 1;
				break;
			}
		}
		if(sig == 0) {
			System.out.println("Not Found!");
		}
	}
}
