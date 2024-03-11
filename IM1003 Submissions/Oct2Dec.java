import java.util.Scanner;

public class Oct2Dec {

	public static void main(String[] args) {
		String inStr;
		int inStrLen,inDigit,decimal = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter an octal string: ");
		inStr = in.next();
		inStrLen = inStr.length();
		
		for (int inStrIdx = inStrLen-1; inStrIdx >= 0; inStrIdx--) {
			inDigit = inStr.charAt(inStrIdx)-'0';
			decimal += inDigit*Math.pow(8, inStrLen-inStrIdx-1);
		}
		System.out.println("The decimal equivalent is: "+decimal);
		in.close();
	}

}
