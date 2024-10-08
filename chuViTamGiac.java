
package code.ptit;

import java.util.Scanner;


class Point {
    double x;
    double y;

    void input(Scanner sc) {
        this.x = sc.nextDouble();
        this.y = sc.nextDouble();
    }

    double distance(Point p) {
        double x0 = this.x - p.x;
        double y0 = this.y - p.y;
        return Math.sqrt(x0 * x0 + y0 * y0);
    }

    double checkTriagle(Point a, Point b) {
        double A = this.distance(a);
        double B = this.distance(b);
        double C = a.distance(b);
        if (A + B > C && B + C > A && A + C > B)
            return A + B + C;
        return -1;
    }
}

public class chuViTamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Point A = new Point();
            Point B = new Point();
            Point C = new Point();
            A.input(sc);
            B.input(sc);
            C.input(sc);
            double k = A.checkTriagle(B, C);
            if (k != -1)
                System.out.printf("%.3f\n", k);
            else
                System.out.println("INVALID");
        }
    }
}