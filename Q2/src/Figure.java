public class Figure {
    private Point2D sp;
    private String color;

    public Figure(Point2D sp, String color) {
        this.sp = sp;
        this.color = color;
    }

    public Point2D getSp() {
        return sp;
    }

    public void setSp(Point2D sp) {
        this.sp = sp;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void display(){
        System.out.println(sp.toString() + "\ncolor : " + color);
    }
}
