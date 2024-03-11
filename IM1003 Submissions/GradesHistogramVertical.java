import java.util.Scanner;

public class GradesHistogramVertical {
	
	public static void main(String[] args) {
		// Declare variables
		  int numStudents, maxStars = 0;
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
		  
		  for (int i = 0; i < bins.length; i++) {
			 if (bins[i] > maxStars) {
				 maxStars = bins[i];
			 }
		  }
		  
		  for (int row = maxStars; row >= 0; row--) {
			 for (int binIdx = 0; binIdx < bins.length; binIdx++) {
				 if (row==0 && binIdx==9) {
					 System.out.print(" 90-100");
				 } else if (row==0) {
					 System.out.printf("%3d-%-3d",binIdx*10,binIdx*10+9);
				 } else if (bins[binIdx]>=row) {
					 System.out.print("   *   ");
				 } else {
					 System.out.print("       ");
				 }
			 }
			 System.out.println();
		  }
	      in.close();
	}
	
}
