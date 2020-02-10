package task;

public class Task8 {
	public static void main(String[] args) {
		char c[][] = new char[3][4];
		
		char ara[][] = {{'1', '2', '3', 'A'}, {'1', '2', 'B', 'C'}, {'1', 'D', 'E', 'F'}};
		int i, j;
		int k = 3;
		for(i = 0; i < 3; i++) {
			for(j = 0; j < k; j++) {
				System.out.print(ara[i][j] +" ");
			}
			System.out.println();
			k--;
		}
		System.out.println();
		k = 3;
		for(i = 0; i < 3; i++) {
			for(j = k; j < 4; j++) {
				System.out.print(ara[i][j] +" ");
			}
			System.out.println();
			k--;
		}
	}
}
