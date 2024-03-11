

public class MyLine {
	private MyPoint begin,end;
	
	public MyLine(int x1,int y1,int x2,int y2) {
		this.begin = new MyPoint(x1,y1);
		this.end = new MyPoint(x2,y2);
	}
	
	public MyLine(MyPoint begin,MyPoint end) {
		this.begin = begin;
		this.end = end;
	}
	
	public MyPoint getBegin() {
		return this.begin;
	}
	
	public MyPoint getEnd() {
		return this.end;
	}
	
	public void setBegin(MyPoint begin) {
		this.begin = begin;
	}
	
	public void setEnd(MyPoint end) {
		this.end = end;
	}
	
	public int getBeginX() {
		return this.begin.getX();
	}
	
	public void setBeginX(int x) {
		this.begin.setX(x);
	}
	
	public int getBeginY() {
		return this.begin.getY();
	}
	
	public void setBeginY(int y) {
		this.begin.setY(y);
	}
	
	public int getEndX() {
		return this.end.getX();
	}
	
	public void setEndX(int x) {
		this.end.setX(x);
	}
	
	public int getEndY() {
		return this.end.getY();
	}
	
	public void setEndY(int y) {
		this.end.setY(y);
	}
	
	public int[] getBeginXY() {
		return this.begin.getXY();
	}
	
	public void setBeginXY(int x,int y) {
		this.begin.setXY(x, y);
	}
	
	public int[] getEndXY() {
		return this.end.getXY();
	}
	
	public void setEndXY(int x,int y) {
		this.end.setXY(x, y);
	}
	
	public double getLength() {
		return this.begin.distance(this.end);
	}
	
	public double getGradient() {
		int xDiff = Math.abs(this.getBeginX() - this.getEndX());
		int yDiff = Math.abs(this.getBeginY() - this.getEndY());
		return Math.atan2(yDiff, xDiff);
	}
	
	public String toString() {
		return "MyLine[begin="+this.begin+",end="+this.end+"]";
	}
	
	
}
