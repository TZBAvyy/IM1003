import java.util.Scanner;

public class ComputePIa {

	public static void main(String[] args) {
		  int maxDenominator;  // to be input
	      double sum = 0.0;
	      Scanner in = new Scanner(System.in);
	      
	      System.out.print("Enter the maximum denominator: ");
		  maxDenominator = in.nextInt(); 

	      for (int denominator = 1; denominator <= maxDenominator; denominator += 2) {
	         // denominator = 1, 3, 5, 7, ..., maxDenominator
	         if (denominator % 4 == 1) {
	            // add into sum
	            sum += (double)1/denominator;
	         } else if (denominator % 4 == 3) {
	            // subtract from sum
	            sum -= (double)1/denominator;
	         } else {
	            System.out.println("impossible - error in logic");
	         }
	      }
	      
	      System.out.printf("The PI computed is: %.10f\n",sum*4);
	      in.close();

	}

}
