import java.util.Scanner;

public class SumAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare variables
	      int lowerbound, upperbound, sum = 0;
	      double average;
	      Scanner in = new Scanner(System.in);
	      

	      // Prompt and read inputs as "int"
	      System.out.print("Enter the lowerbound: ");
	      lowerbound = in.nextInt();
	      System.out.print("Enter the upperbound: ");
	      upperbound = in.nextInt();
	      
	      // Compute sum using a for-loop
	      for (int number = lowerbound; number <= upperbound; ++number) {
	         sum += number;
	      }

	      // Compute average
	      // Take note that int/int gives int. Type casting needed.
	      // The total count is (upperbound - lowerbound + 1)
	      average = (double)sum/(upperbound-lowerbound+1);

	      // Display results
	      System.out.printf("The sum is: %d\n",sum);
	      System.out.printf("The average is: %.2f\n",average);
	      in.close();
	}

}
