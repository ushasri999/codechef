
// package contests;
import java.util.*;

public class LCMMania {
    private static void lcmMania(int n) {
        int d = n;
        int ans = 0;
        while (d % 2 == 0) {
            d /= 2;
            ans++;
        }

        if (d == 1) {
            System.out.println("-1");
            return;
        }

        int fact = 1 << ans;
        int a = ((d - 1) / 2) * fact;
        int b = fact;
        int c = fact;

        System.out.println(a + " " + b + " " + c);
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            lcmMania(n);
        }
    }
}
