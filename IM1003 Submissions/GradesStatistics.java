import java.util.Scanner;

public class GradesStatistics {

	public static void main(String[] args) {
		int numStudents, max = 0, min = 100, total = 0;
		double average;
		int[] grades;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the number of students: ");
		numStudents = in.nextInt();
		
		grades = new int[numStudents];
		for (int i = 0; i < grades.length; i++) {
			System.out.printf("Enter the grade for student %d: ",i+1);
			grades[i] = in.nextInt();
			total += grades[i];
			if (grades[i] > max) {
				max = grades[i];
			}
			if (grades[i] < min) {
				min = grades[i];
			}
		}
		average = (double)total/numStudents;
		System.out.printf("The average is: %.2f\n",average);
		System.out.println("The minimum is: "+min);
		System.out.println("The maximum is: "+max);
		in.close();
	}

}
