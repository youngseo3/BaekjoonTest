import java.util.Scanner;

public class S35_25314 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		String str = "";
		
		scanner.close();
		
		for(int i=1; i<=n/4; i++) {
			str += "long ";		
		}
		System.out.println(str + "int");
	}
}
