public class ClosedFigure extends Figure{
    private float width;
    private float length;
    private boolean fillWithColor;

    public ClosedFigure(Point2D sp, String color, float width, float length, boolean fillWithColor) {
        super(sp, color);
        this.width = width;
        this.length = length;
        this.fillWithColor = fillWithColor;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public boolean isFillWithColor() {
        return fillWithColor;
    }

    public void setFillWithColor(boolean fillWithColor) {
        this.fillWithColor = fillWithColor;
    }
    public float area(){
        return 0;
    }
    public void display(){
        System.out.println("Width : " + width + " Length : " + length + " fill With Specific Color : " + fillWithColor + " area : " + area());
    }

}
