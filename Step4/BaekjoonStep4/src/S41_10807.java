import java.util.Scanner;
public class S41_10807 {
	public static void main(String argsp[]) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int array[] = new int[n];
		
		int count = 0;
		
		for(int i=0; i<n; i++) {
			array[i] = scanner.nextInt();
		}
		int v = scanner.nextInt();
		
		for(int j=0; j<n; j++) {
			if(array[j] == v )
				count++;
		}
		System.out.println(count);
	}
}