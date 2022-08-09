package E3;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setXY(float x, float y){
        setX(x);
        setY(y);

    }

    public float[] getXY(){
        float []arr = {this.x,this.y};
        return arr;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "E3.Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
