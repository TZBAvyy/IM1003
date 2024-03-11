
import java.util.Scanner;

public class Multiple {
	public static void main (String[] args) {
		int first,second;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter 1st integer: ");
		first = in.nextInt();
		System.out.print("Enter 2nd integer: ");
		second = in.nextInt();
		
		if (first % second == 0) {
			System.out.printf("%d IS a multiple of %d",first,second);
		} else {
			System.out.printf("%d IS NOT a multiple of %d",first,second);
		}
		
		in.close();
	}
}