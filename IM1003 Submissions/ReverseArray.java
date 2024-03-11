import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		int numberItem;
		int[] items;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the number of items: ");
		numberItem = in.nextInt();
		
		items = new int[numberItem];
		if (numberItem>0) {
			System.out.print("Enter the value of all items (separated by space): ");
			for (int i = 0; i < items.length; i++) {
				items[i] = in.nextInt();
			}
		}
		
		System.out.print("The original array is: ");
		printArray(items);
		
		reverse(items);
		
		System.out.print("The reverse is: ");
		printArray(items);
		
		in.close();
	}
	
	public static void printArray(int[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			if (i==0) {
				System.out.print(array[i]);
			} else {
				System.out.print(", "+array[i]);
			}
		}
		System.out.println("]");
	}
	
	public static void reverse(int[] array) {
		int temp;
		for (int i = 0; i < array.length/2; i++) {
			temp = array[array.length-1-i];
			array[array.length-1-i] = array[i];
			array[i] = temp;
		}
	}

}
