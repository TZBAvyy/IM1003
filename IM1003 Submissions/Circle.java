public class Circle extends Shape{
	
	private double radius = 1.0;
	
	public Circle() {
		super();
	}
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public Circle(double radius,String color,boolean filled) {
		super(color,filled);
	}

	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return this.radius*this.radius*Math.PI;
	}
	
	public double getPerimeter() {
		return this.radius*2*Math.PI;
	}
	
	@Override
	public String toString() {
		return String.format("Circle[%s,radius=%s]", super.toString(),radius);
	}
}
