import java.util.Scanner;

public class SearchArray {

	public static void main(String[] args) {
		int numberItem, searchKey, idx;
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
		
		System.out.print("Enter the search key: ");
		searchKey = in.nextInt();
		
		idx = search(items, searchKey);
		if (idx!=-1) {
			System.out.println(searchKey+" is found with index "+idx);
		} else {
			System.out.println(searchKey+" is not found");
		}
		in.close();
	}
	
	public static int search(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if (array[i]==key) {
				return i;
			}
		}
		return -1;
	}

}
