import java.util.Scanner;

public class Bin2Dec {

	public static void main(String[] args) {
		String inStr;
		int inStrLen,inDigit,decimal = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a binary string: ");
		inStr = in.next();
		inStrLen = inStr.length();
		
		for (int inStrIdx = inStrLen-1; inStrIdx >= 0; inStrIdx--) {
			inDigit = inStr.charAt(inStrIdx)-'0';
			decimal += inDigit*Math.pow(2, inStrLen-inStrIdx-1);
		}
		System.out.println("The decimal equivalent is: "+decimal);
		in.close();
	}

}
