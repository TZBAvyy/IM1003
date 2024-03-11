import java.util.Scanner;

public class CaesarCode {

	public static void main(String[] args) {
		final int N=3;
		String inStr,cypherStr = "";
		int inStrLen;
		char inChar;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a plaintext string: ");
		inStr = in.next().toUpperCase();
		inStrLen = inStr.length();
		
		for (int inStrIdx = 0; inStrIdx < inStrLen; inStrIdx++) {
			inChar = inStr.charAt(inStrIdx);
			cypherStr += (char)(65+(inChar + N - 65)%26);
		}
		System.out.println("The ciphertext string is: "+cypherStr);
		in.close();
	}

}
