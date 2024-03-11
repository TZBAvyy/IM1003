//Exercise 1.5

import java.util.Scanner;

public class PrintDayInWord {   
   public static void main(String[] args) {
      int number;
      
      Scanner in = new Scanner(System.in);
      System.out.print("Enter the day number: ");
      number = in.nextInt();
      
      // Using nested-if
      if (number == 0) {   // Use == for comparison
         System.out.println("Sunday");
      } else if (number == 1) {
         System.out.println("Monday");
      } else if (number == 2) {
         System.out.println("Tuesday");
      } else if (number == 3) {
         System.out.println("Wednesday");
      } else if (number == 4) {
         System.out.println("Thursday");
	  } else if (number == 5) {
         System.out.println("Friday"); 
	  } else if (number == 6) {
         System.out.println("Saturday"); 
      } else {
         System.out.println("Not a valid day");
      }
      System.out.println("bye");
      in.close();
   }
}
