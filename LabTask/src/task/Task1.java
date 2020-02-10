package task;

import java.util.Scanner;

public class Task1 {
	static float area(float l, float w) {
		return l * w;
	}
	
	static float perimeter(float l, float w) {
		return 2 * (l + w);
	}
	
	public static void main(String[] args) {
		//System.out.println("Java");
		Scanner rectangle = new Scanner(System.in);
		System.out.println("Enter the length: ");
		float length = rectangle.nextFloat();
		System.out.println("Enter the width: ");
		float width = rectangle.nextFloat();
		float a = area(length, width);
		System.out.println("Area of rectangle = " + a);
		
		float p = perimeter(length, width);
		
		System.out.println("Perimeter of the rectangle = " + p);
	}
}
