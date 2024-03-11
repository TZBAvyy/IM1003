import java.util.Scanner;

public class TimesTable {

	public static void main(String[] args) {
		int size;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the size of the table: ");
		size = in.nextInt();
		
		for (int row=-1;row<=size;++row) {
			for (int col=0;col<=size;++col) {
				
				if (row==-1) { //Row -1 Indicates HEADER row, this gives the * |   1   2...
					if (col==0) {
						System.out.print(" * |");
					} else {
						System.out.printf("%4d",col);
					}
					
				} else if (row==0) { //Row 0 indicates the PARTITION row, giving the ===+=======...
					if (col==0) {
						System.out.print("===+");
					} else {
						System.out.print("====");
					}
					
				} else { //Row 1+ indicates the actual table of contents
					if (col==0) {
						System.out.printf("%2d |",row);
					} else {
						System.out.printf("%4d",row*col);
					}
				}
			}
			System.out.println();
		}
		in.close();
	}
}
