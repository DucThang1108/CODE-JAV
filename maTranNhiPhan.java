
package code.ptit;
import java.util.Scanner;

public class maTranNhiPhan {
     public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x, res = 0;
        for (int i = 0; i < n; ++i)
        {
            int cnt = 0;
            for (int j = 0; j < 3; ++j)
            {
                x = sc.nextInt();
                if (x == 1)
                    ++cnt;
            }
            if (cnt > 1)
                ++res;
        }
        System.out.println(res);
    }
}
