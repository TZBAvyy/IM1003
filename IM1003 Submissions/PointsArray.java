

public class PointsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint[] points = new MyPoint[10];
		for (int i = 0; i < points.length; i++) {
			points[i] = new MyPoint(i+1,i+1);    // Allocate each of MyPoint instances
		}
		for (int i = 0; i < points.length; i++) {
			System.out.println(points[i]);
		}
	}

}
