import java.util.Scanner;

public class S44_2562 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int array[] = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
		
		scanner.close();
		
		int count = 0;
		int maxNum = 0;
		int index = 0;
		
		for (int i : array) {
			count ++;
			
			if( i > maxNum) {
				maxNum = i;
				index = count;
			}
		}
		System.out.print(maxNum + "\n" + index);
	}
}
