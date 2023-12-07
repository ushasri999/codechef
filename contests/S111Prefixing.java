package contests;

import java.util.*;
import java.lang.*;
import java.io.*;

public class S111Prefixing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            int maxElem = Integer.MIN_VALUE;
            Map<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();

                maxElem = Math.max(maxElem, a[i]);
                map.putIfAbsent(a[i], i);
            }

            for (int i = 0; i < n; i++) {
                if (map.get(a[i]) == i) {
                    System.out.print(a[i] + " ");
                } else {
                    System.out.print(maxElem + " ");
                }
            }

            System.out.println();
        }
    }
}
