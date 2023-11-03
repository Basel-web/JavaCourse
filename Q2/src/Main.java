import java.util.Scanner;

public class Main {
    static  boolean  check(String s1, String s2){
        return s1.equals(s2);
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (true) {
            System.out.println("please Enter a point for the Figure and a color");
            double x,y;
            x = cin.nextDouble();
            y = cin.nextDouble();
            Point2D p = new Point2D(x, y);
            String s = cin.next();
            Figure figure1 = new Figure(p, s);
            System.out.println("Your Figure information is");
            figure1.display();
            System.out.println("Now please enter  width and height and a specific color to convert the figure to a closedFigure");
            float w, h;
            String sc;
            w = cin.nextFloat();
            h = cin.nextFloat();
            sc = cin.next();
            boolean is = check(s,sc);
            ClosedFigure closedFigure = new ClosedFigure(p,sc,w,h,is);
            System.out.println("Now lets display closedFigure Data");
            closedFigure.display();
            System.out.println("Now we will convert it to a rectangle and show the data");
            Rectangle r = new Rectangle(p,s,w,h,true);
            r.display();
            System.out.println("Now please enter an end point to call the second constructor\n enter x and Y");
            double a = cin.nextDouble();
            double b = cin.nextDouble();
            Point2D ep = new Point2D(a, b);
            Rectangle nr = new Rectangle(p,ep,s,true);
            System.out.println("His info");
            nr.display();
            System.out.println("if u finished enter 0 else enter 1");
            int e = cin.nextInt();
            if (e == 0)
                break;
        }
    }
}