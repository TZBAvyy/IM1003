

public class MyPoint {
	private int x = 0, y = 0;
	
	public MyPoint() {
	}
	
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int[] getXY() {
		int[] arr = {this.x,this.y};
		return arr;
	}
	
	public void setXY(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return String.format("(%d,%d)",this.x,this.y);
	}
	
	public double distance() { //From (0,0)
		return Math.sqrt(this.x*this.x + this.y*this.y);
	}
	
	public double distance(int x,int y) {
		int xDiff = this.x - x;
		int yDiff = this.y - y;
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	}
	
	public double distance(MyPoint another) {
		int xDiff = this.x - another.getX();
		int yDiff = this.y - another.getY();
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	}
}
