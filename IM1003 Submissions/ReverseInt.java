import java.util.Scanner;

public class ReverseInt {

	public static void main(String[] args) {
		  // Declare variables
	      int inNumber;   // to be input
	      int inDigit;    // each digit
	      Scanner in = new Scanner(System.in);
	      
	      System.out.print("Enter a positive integer: ");
		  inNumber = in.nextInt();
	      
	      System.out.print("The reverse is: ");
	      // Extract and drop the "last" digit repeatedly using a while-loop with modulus/divide operations
	      while (inNumber > 0) {
	         inDigit = inNumber % 10; // extract the "last" digit
	         // Print this digit (which is extracted in reverse order)
	         System.out.print(inDigit);
	         inNumber /= 10;          // drop "last" digit and repeat
	      }
	      System.out.print("\n");
	      in.close();

	}

}
