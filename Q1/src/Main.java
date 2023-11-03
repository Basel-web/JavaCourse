import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Please Enter 5 points as (x, y)");
        Point2D[] points = new Point2D[5];
        Scanner cin = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            double x,y;
            x = cin.nextDouble();
            y = cin.nextDouble();
            points[i] = new Point2D(x, y);
        }

        //clac the distance between the points in 2D

        while (true){
            System.out.println("Enter the indices of the points u wanna calc there distance");
            int x, y;
            x = cin.nextInt();
            y = cin.nextInt();
            System.out.println(points[x].distance(points[y]));
            System.out.println("if u wanna exit press 0 else press 1");
            int e = cin.nextInt();
            if(e == 0)
                break;
        }

        //checking the equality of the points

        while (true){
            System.out.println("Enter the indices of the points u wanna check there equality");
            int x, y;
            x = cin.nextInt();
            y = cin.nextInt();
            System.out.println(points[x].equals(points[y]));
            System.out.println("if u wanna exit press 0 else press 1");
            int e = cin.nextInt();
            if(e == 0)
                break;
        }

        System.out.println("Now we wanna make two points as 3D so select the indices and enter 3 values for each one");
        for (int i = 0; i < 2; i++) {
            int ind1;
            double x,y,z;
            ind1 = cin.nextInt();
            x = cin.nextDouble();
            y = cin.nextDouble();
            z = cin.nextDouble();
            points[ind1] = new Point3D(x, y, z);
        }

        //clac the distance between the points in 2D

        while (true){
            System.out.println("Enter the indices of the points u wanna calc there distance");
            int x, y;
            x = cin.nextInt();
            y = cin.nextInt();
            System.out.println(points[x].distance(points[y]));
            System.out.println("if u wanna exit press 0 else press 1");
            int e = cin.nextInt();
            if(e == 0)
                break;
        }

        //checking the equality of the points

        while (true){
            System.out.println("Enter the indices of the points u wanna check there equality");
            int x, y;
            x = cin.nextInt();
            y = cin.nextInt();
            System.out.println(points[x].equals(points[y]));
            System.out.println("if u wanna exit press 0 else press 1");
            int e = cin.nextInt();
            if(e == 0)
                break;
        }
    }
}