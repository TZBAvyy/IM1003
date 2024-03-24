public class Circle extends Shape{
	
	protected double radius = 1.0;
	
	public Circle() {
		super();
	}
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public Circle(double radius,String color,boolean filled) {
		super(color,filled);
		this.radius = radius;
	}

	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	@Override
	double getArea() {	
		return this.radius*this.radius*Math.PI;
	}
	
	@Override
	double getPerimeter() {
		return this.radius*2*Math.PI;
	}
	
	@Override
	public String toString() {
		return String.format("Circle[%s,radius=%s]", super.toString(),radius);
	}
}
