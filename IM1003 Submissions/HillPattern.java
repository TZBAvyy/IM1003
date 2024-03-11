import java.util.Scanner;

public class HillPattern {

	public static void main(String[] args) {
		int numRows,numCol;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the rows: ");
		numRows = in.nextInt();
		numCol = 2*numRows - 1;
		
		for (int row = 1; row<=numRows; ++row) {
	        for (int col = 1; col<=numCol; ++col) {
	           if ((row + col >= numRows + 1) && (row >= col - numRows + 1)) {
	              System.out.print("^");;
	           } else {
	              System.out.print(" ");;
	           }
	        }
	        System.out.println();;
	    }
		in.close();
	}

}
