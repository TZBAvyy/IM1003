import java.util.Scanner;

public class PrintArrayInStars {

	public static void main(String[] args) {
		// Declare variables
	      int numItems;
	      int[] items;  // Declare array name, to be allocated after numItems is known
	      Scanner in = new Scanner(System.in);
	      
	      System.out.print("Enter the number of items: ");
		  numItems = in.nextInt();
		  
		  items = new int[numItems];
		  if (numItems!=0) {
			  System.out.print("Enter the value of all items (separated by space): ");
			  for (int i = 0; i < items.length; i++) {
				 items[i] = in.nextInt();
			  }
		  }

	      // Print array contents (in index: number of stars) using a nested-loop
	      for (int idx = 0; idx < items.length; ++idx) {  // row
	         System.out.print(idx + ": ");
	         // Print value as the number of stars
	         for (int starNo = 1; starNo <= items[idx]; ++starNo) {  // col
	            System.out.print("*");
	         }
	         System.out.printf("(%d)\n",items[idx]);
	      }
	      in.close();
	}

}
