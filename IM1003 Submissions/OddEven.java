
import java.util.Scanner;
// Declare variables
public class OddEven {
	public static void main (String[] args) {
		int numberIn;   // input integer
		Scanner in = new Scanner(System.in);
		// Prompt and read input as "int"
		System.out.print("Enter a number: ");
		numberIn = in.nextInt();
		
		if (isOdd(numberIn)) {
			System.out.println(numberIn+" is an odd number");
		} else {
			System.out.println(numberIn+" is an even number");
		}
		in.close();
	}
	
	public static boolean isOdd(int number) {
	      // Check odd/even and print result
	      // Use % to find the remainder dividing by 2, and compare with 0
		if (number % 2 != 0) {      // double-equal for comparison
			return true;
	    } else {
	    	return false;
	    }
	}
}