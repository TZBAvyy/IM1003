import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {
		int numberIn;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a positive integer: ");
		numberIn = in.nextInt();
		
		if (isMagic(numberIn)) {
			System.out.println(numberIn+" is a magic number");
		} else {
			System.out.println(numberIn+" is not a magic number");
		}
		in.close();
	}
	
	public static boolean isMagic(int number) {
		for (int digit = number%10; number > 0; number = number/10,digit = number%10) {
			if (digit==8) {
				return true;
			}
		}
		return false;
	}

}
