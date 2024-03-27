public class Rectangle implements GeometricObject {
	private double width,length;

	public Rectangle(double width,double length) {
		this.width = width;
		this.length = length;
	}

	@Override
	public String toString() {
		return String.format("Rectangle[width=%s,length=%s]", width,length);
	}

	@Override
	public double getArea() {
		return width*length;
	}

	@Override
	public double getPerimeter() {
		return width*2+length*2;
	}
}