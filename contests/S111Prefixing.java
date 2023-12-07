package contests;

import java.util.*;
import java.lang.*;
import java.io.*;

public class S111Prefixing {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            int maxElem = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                maxElem = Math.max(maxElem, a[i]);
            }

            Set<Integer> elementsUpto = new HashSet<>();
            for (int i = 0; i < n; i++) {
                if (elementsUpto.contains(a[i])) {
                    System.out.print(maxElem + " ");
                } else {
                    System.out.print(a[i] + " ");
                }

                elementsUpto.add(a[i]);
            }

            System.out.println();
        }
    }
}
