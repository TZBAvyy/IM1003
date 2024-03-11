import java.util.Scanner;

// Added functionality for long
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		long result = 1;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		number = in.nextInt();
		
		for (int i = 1; i <= number; ++i) {
			result = result*i;
		}
		
		System.out.printf("The Factorial of %d is: %d\n",number,result);
		in.close();
	}

}
