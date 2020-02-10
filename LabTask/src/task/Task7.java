package task;

public class Task7 {
	public static void main(String[] args) {
		char star = '*';
		int i;
		int j;
		for(i = 0; i < 3; i++) {
			for(j = 0; j <= i; j++) {
				System.out.print(star);
			}
			System.out.println();
		}
		System.out.println();
		for(i = 3; i > 0; i--) {
			for(j = 1; j <= i; j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
		System.out.println();
		int k = 65;
		for(i = 1; i < 4; i++) {
			for(j = 1; j <= i; j++) {
				char c = (char) k;
				System.out.print(c+ " ");
				k++;
			}
			System.out.println();
		}
	}
}
