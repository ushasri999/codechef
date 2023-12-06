package contests;

import java.util.Scanner;

public class Staters107OrPermutation {
    private static void orPermutation(int n) {
        for (int i = n; i > 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            orPermutation(n);
        }
    }
}
