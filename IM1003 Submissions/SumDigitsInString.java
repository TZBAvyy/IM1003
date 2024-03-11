import java.util.Scanner;

public class SumDigitsInString {

	public static void main(String[] args) {
		String inStr;
		int inStrLen,sum = 0;
		char inChar;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a String: ");
		inStr = in.next().toLowerCase();
		inStrLen = inStr.length();
		
		for (int inStrIdx = 0; inStrIdx < inStrLen; inStrIdx++) {
			inChar = inStr.charAt(inStrIdx);
			if (Character.isDigit(inChar)) {
				sum += inChar - '0';
			}
		}
		System.out.println("The sum of all digits is: "+sum);
		in.close();
	}

}
