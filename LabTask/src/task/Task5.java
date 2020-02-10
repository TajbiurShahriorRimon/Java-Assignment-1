package task;


public class Task5 {
	public static void main(String[] args) {
		int i;
		for(i = 10; i <= 100; i++) {
			if(i % 2 == 0) {
				continue;
			}
			else {
				System.out.print(i + " ");
			}
		}
	}
}
