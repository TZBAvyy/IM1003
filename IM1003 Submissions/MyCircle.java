
public class MyCircle {
	
	private MyPoint center = new MyPoint(0,0);
	private int radius = 1;
	
	public MyCircle() {
	}
	
	public MyCircle(int x, int y, int radius) {
		this.radius = radius;
		this.center = new MyPoint(x,y);
	}
	
	public MyCircle(MyPoint center, int radius) {
		this.radius = radius;
		this.center = center;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public MyPoint getCenter() {
		return center;
	}
	
	public void setCenter(MyPoint center) {
		this.center = center;
	}
	
	public int getCenterX() {
		return center.getX();
	}
	
	public void setCenterX(int x) {
		center.setX(x);
	}
	
	public int getCenterY() {
		return center.getY();
	}
	
	public void setCenterY(int y) {
		center.setY(y);
	}
	
	public int[] getCenterXY() {
		return center.getXY();
	}
	
	public void setCenterXY(int x, int y) {
		center.setXY(x, y);
	}
	
	@Override
	public String toString() {
		return String.format("MyCircle[radius=%d,center=%s]", radius,center);
	}
	
	public double getArea() {
		return Math.PI*radius*radius;
	}
	
	public double getCircumference() {
		return Math.PI*2*radius;
	}
	
	public double distance(MyCircle another) {
		return center.distance(another.getCenter());
	}
}
