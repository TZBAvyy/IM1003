import java.util.Scanner;

public class CountVowelDigit {
	
	public static void main(String[] args) {
		String inStr;
		int inStrLen, vowelCount = 0, digitCount = 0;
		char inChar;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a String: ");
		inStr = in.next().toLowerCase();
		inStrLen = inStr.length();
		
		for (int inCharIdx = 0; inCharIdx < inStrLen; inCharIdx++) {
			inChar = inStr.charAt(inCharIdx);
			if (Character.isDigit(inChar)) {
				digitCount += 1;
			} else {
				switch(inChar) {
					case 'a': case 'e': case 'i': case 'o': case 'u':
						vowelCount += 1; break;
					default:
				}
			}
		}
		System.out.printf("Number of vowels is: %d (%.2f%%)\n",vowelCount,(double)vowelCount/inStrLen*100);
		System.out.printf("Number of digits is: %d (%.2f%%)\n",digitCount,(double)digitCount/inStrLen*100);
		in.close();
	}
}
