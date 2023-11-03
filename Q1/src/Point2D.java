import java.util.ArrayList;

import static java.lang.Math.sqrt;

public class Point2D {
    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public double[] getXY(){
        double[] ar = new double[2];
        ar[0] = x;
        ar[1] = y;
        return ar;
    }
    public double distance(Point2D p){
        return sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y));
    }
    public double distance(int x,  int y){
        return sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    public boolean equals (Point2D p){
        return x == p.x && y == p.y;
    }
}
