public class MovablePoint extends Point{
    private float xSpeed = 0.0f, ySpeed = 0.0f;

    public MovablePoint() {
        super();
    }

    public MovablePoint(float x,float y,float xSpeed,float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] result = {xSpeed,ySpeed};
        return result;
    }

    @Override
    public String toString() {
        return String.format("(%s,%s),speed=(%s,%s)", getX(),getY(),getXSpeed(),getYSpeed());
    }

    public MovablePoint move() {
        setX(getX()+xSpeed);
        setY(getY()+ySpeed);
        return this;
    }
}
