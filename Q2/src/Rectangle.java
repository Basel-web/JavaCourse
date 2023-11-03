public class Rectangle extends ClosedFigure{
    Rectangle(Point2D p, String color, float width, float length, boolean fc){
        super(p, color,width, length, fc);
    }
    Rectangle(Point2D sp, Point2D ep, String color,boolean fc){
        super(sp, color, (float) Math.abs(sp.getX() - ep.getX()), (float) Math.abs(sp.getY() - ep.getY()), fc);
    }
    public float area(){
        return getWidth() * getLength();
    }
    public void display(){
        System.out.println("Rectangle Info\n" + "Width : " + getWidth() + "\nLength : " + getLength() + "\nColor : " + getColor() + "\nArea : " + area());
    }

}
