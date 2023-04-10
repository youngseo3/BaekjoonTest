import java.util.Scanner;

public class S32_10950 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		int t = scanner.nextInt();
		int intArray[] = new int[t];
		
		for (int i = 0; i < t; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			intArray[i] = a + b ;
		}
		scanner.close();
		
		for(int k : intArray) {
			System.out.println(k);
		}	
	}
}
