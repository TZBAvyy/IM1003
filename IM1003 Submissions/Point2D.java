public class Point2D {
    private float x = 0.0f, y = 0.0f;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;        
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        float[] result = {x,y};
        return result;
    }

    public void setXY(float x,float y) {
        setX(x);
        setY(y);
    }

    @Override
    public String toString() {
        return String.format("(%s,%s)",x,y);
    }
    
}
