public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getPerimeter(){
        return 2 * (width + length);
    }
    public double getArea(){
        return width * length;
    }
    @Override
    public String toString(){
        return "Width: " + width + "\n" +
                "Length: " + length + "\n" +
                "perimeter: " + getPerimeter() + "\n" +
                "Are: " + getArea() + "\n";
    }
}
