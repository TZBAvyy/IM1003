import java.util.Scanner;

public class SphereComputation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius,volume,surfaceArea;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the radius: ");
		radius = in.nextDouble();
		
		surfaceArea = 4 * Math.PI * radius * radius;
		volume = (double)4/3 * Math.PI * radius * radius * radius;
		
		System.out.printf("Surface Area is: %.2f\n", surfaceArea);
		System.out.printf("Volume is: %.2f%n", volume);
		in.close();
	}

}
