import java.util.Scanner;

public class TriangularNumberPattern {

	public static void main(String[] args) {
		int size,count;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the size: ");
		size = in.nextInt();
		
		for (int row = 1; row <= size; row++) {
			count = 1;
			for (int col = 1; col <= size; col++) {
				if (col >= row) {
					System.out.print(count);
					count += 1;
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		in.close();

	}

}
