
public class Rectangle extends Shape{
	
	private double length = 1.0, width= 1.0;
	
	public Rectangle() {
		super();
	}
	
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	public Rectangle(double width,double length, String color, boolean filled) {
		super(color,filled);
		this.length = length;
		this.width = width;
	}
	
	public double getLength() {
		return this.length;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getArea() {
		return this.length*this.width;
	}
	
	public double getPerimeter() {
		return this.length*2+this.width*2;
	}
	
	@Override
	public String toString() {
		return String.format("Rectangle[%s,width=%s,length=%s]", super.toString(),width,length);
	}
}
