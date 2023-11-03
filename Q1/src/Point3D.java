import static java.lang.Math.sqrt;
public class Point3D extends Point2D{
    private double z;

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    public void setXYZ(double x, double y, double z){
        super.setX(x);
        super.setY(y);
        this.z = z;
    }
    public double[] getXYZ(){
        double[] ar = new double[3];
        ar[0] = super.getX();
        ar[1] = super.getY();
        ar[2] = z;
        return ar;
    }
    public double distance(Point3D p){
        return sqrt(Math.pow(super.getX() - p.getX(),2) + Math.pow(super.getY() - p.getY(),2) + Math.pow(z - p.z, 2));
    }
    public double distance(int x, int y, int z){
        return sqrt(Math.pow(getX() - x, 2) + Math.pow(getY() - y, 2) + Math.pow(this.z - z , 2));
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x= " + getX() +
                " y= " + getY() +
                " z= " + z +
                '}';
    }
    public boolean equals (Point3D p){
        return getX() == p.getX() && getY() == p.getY() && this.z == p.z;
    }

}
