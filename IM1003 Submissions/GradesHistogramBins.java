import java.util.Scanner;

public class GradesHistogramBins {

	public static void main(String[] args) {
		// Declare variables
	      int numStudents;
	      int[] grades;     // Declare array name, to be allocated after numStudents is known
	      int[] bins = new int[10];   // int array of 10 histogram bins for 0-9, 10-19, ..., 90-100
	      Scanner in = new Scanner(System.in);
	      
	      System.out.print("Enter the number of students: ");
		  numStudents = in.nextInt();
		  
		  grades = new int[numStudents];
		  for (int i = 0; i < grades.length; i++) {
			 System.out.printf("Enter the grade for student %d: ",i+1);
			 grades[i] = in.nextInt();
		  }

	      // Populate the bins
	      for (int i = 0; i < grades.length; ++i) {
	         if (grades[i] == 100) {   // Need to handle 90-100 separately as it has 11 items.
	            ++bins[9];
	         } else {
	            ++bins[grades[i]/10];
	         }
	      }

	      // Print the bins
	      for (int binIdx = 0; binIdx < bins.length; ++binIdx) {
	         if (binIdx != 9) {   // Need to handle 90-100 separately as it has 11 items.
	            System.out.printf("%2d-%3d: ", binIdx*10, binIdx*10+9);
	         } else {
	            System.out.print("90-100: ");
	         }
	         System.out.println(bins[binIdx]);
	      }
	      in.close();
	}

}
