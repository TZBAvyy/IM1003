import java.util.Scanner;

public class ExchangeCode {

	public static void main(String[] args) {
		String inStr,cypherStr = "";
		char inChar,cypherChar;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a plaintext string: ");
		inStr = in.next().toUpperCase();
		
		for (int inStrIdx = 0; inStrIdx < inStr.length(); inStrIdx++) {
			inChar = inStr.charAt(inStrIdx);
			cypherChar = (char)('A' + 'Z' - inChar);
			cypherStr += cypherChar;
		}
		System.out.println("The ciphertext string is: "+cypherStr);
		in.close();
	}

}
