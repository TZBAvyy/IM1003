import java.util.Scanner;

public class CircleComputation {

	public static void main(String[] args) {
		double radius,diameter,circumference,area;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the radius: ");
		radius = in.nextDouble();
		
		diameter = radius*2;
		circumference = Math.PI*diameter;
		area = Math.PI*radius*radius;
		System.out.printf("Diameter is: %.2f\n",diameter);
		System.out.printf("Circumference is: %.2f\n",circumference);
		System.out.printf("Area is: %.2f",area);
		in.close();
	}

}
