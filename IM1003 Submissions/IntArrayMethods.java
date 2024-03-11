import java.util.Scanner;

public class IntArrayMethods {

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
		
		print(items);
		System.out.println("The min is: "+min(items));
		System.out.println("The max is: "+max(items));
		System.out.println("The sum is: "+sum(items));
		System.out.printf("The average (rounded to 2 decimal places) is: %.2f\n",average(items));
		if (isEmpty(items)) {
			System.out.println("This array is empty");
		} else {
			System.out.println("This array is not empty");
		}
		in.close();
	}
	public static void print(int[] array) {
		// print [x1, x2, ..., xn]
		System.out.print("The values are: [");
		for (int i = 0; i < array.length; i++) {
			if (i==0) {
				System.out.print(array[i]);
			} else {
				System.out.print(", "+array[i]);
			}
		}
		System.out.println("]");
	}
	public static int min(int[] array) {
		// Returns the minimum
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i]<min) {
				min = array[i];
			}
		}
		return min;
	}
    public static int max(int[] array) {
    	// Returns the maximum
    	int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i]>max) {
				max = array[i];
			}
		}
		return max;
    }
    public static int sum(int[] array) {
    	// Returns the sum
    	int sum = 0;
    	for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
    	return sum;
    }
    public static double average(int[] array) {
    	// Returns the average in double
    	int sum = 0;
    	for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
    	return (double)sum/array.length;
    }
    public static boolean isEmpty(int[] array) {
    	// Returns true if array's length is 0
    	return array.length==0;
    }



}
