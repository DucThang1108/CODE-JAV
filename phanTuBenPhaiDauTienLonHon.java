
package code.ptitv2;

import java.util.Scanner;

public class phanTuBenPhaiDauTienLonHon {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n - 1; i++) {
                boolean check = false;
                for (int j = i + 1; j < n; j++) {
                    if (a[j] > a[i]) {
                        System.out.print(a[j] + " ");
                        check = true;
                        break;
                    }
                }
                if (!check) {
                    System.out.print(-1 + " ");
                }
            }
            System.out.println(-1);
        }
    }
}