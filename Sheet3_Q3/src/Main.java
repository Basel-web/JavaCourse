import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the number of the rectangles");
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        Rectangle[] r = new Rectangle[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the width and the length of the rectangle number " + (i + 1));
            int w, l;
            w = cin.nextInt();
            l = cin.nextInt();
            r[i] = new Rectangle(l, w);
        }

        // Print rectangles information
        for (int i = 0; i < n; i++) {
            System.out.println("The info of the rectangle number " + (i + 1) + "\n" + r[i].toString());
        }
    }
}