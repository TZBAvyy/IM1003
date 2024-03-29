import java.util.Scanner;

public class SalesTax {

	public static void main(String[] args) {
		  // Declare constants
	      final double SALES_TAX_RATE = 0.07;
	      final int SENTINEL = -1;        // Terminating value for input

	      // Declare variables
	      double price, actualPrice, salesTax;  // inputs and results
	      double totalPrice = 0.0, totalActualPrice = 0.0, totalSalesTax = 0.0;  // to accumulate
	      Scanner in = new Scanner(System.in);

	      // Read the first input to "seed" the while loop
	      System.out.print("Enter the tax-inclusive price in dollars (or -1 to end): ");
	      price =  in.nextDouble();

	      while (price != SENTINEL) {
	         // Compute the tax
	         actualPrice = price/(1+SALES_TAX_RATE);
	         salesTax = actualPrice*SALES_TAX_RATE;
	         // Accumulate into the totals
	         totalPrice += price;
	         totalActualPrice += actualPrice;
	         totalSalesTax += salesTax;
	         
	         // Print results
	         System.out.printf("Actual Price is: $%.2f, Sales Tax is: $%.2f\n\n",actualPrice,salesTax);

	         // Read the next input
	         System.out.print("Enter the tax-inclusive price in dollars (or -1 to end): ");
	         price =  in.nextDouble();
	         // Repeat the loop body, only if the input is not the sentinel value.
	         // Take note that you need to repeat these two statements inside/outside the loop!
	      }
	      // print totals
	      System.out.printf("Total Price is: $%.2f\n"
	      		+ "Total Actual Price is: $%.2f\n"
	      		+ "Total Sales Tax is: $%.2f\n", 
	      		totalPrice,totalActualPrice,totalSalesTax);
	      in.close();

	}

}
