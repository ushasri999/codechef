import java.util.*;

public class S112CursedIndices {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            boolean isCursed[] = new boolean[n];
            Arrays.fill(isCursed, true);

            List<Integer> ans = new ArrayList<>();
            ans.add(arr[0]);

            int prefixSum = arr[0];
            for (int i = 1; i < n; i++) {
                if (arr[i] > prefixSum) {
                    isCursed[i] = false;
                    ans.add(arr[i]);
                    prefixSum += arr[i];
                }
            }

            int numOfCursedIndices = 0;
            for (int i = 1; i < n; i++) {
                if (isCursed[i]) {
                    ans.add(arr[i]);
                    numOfCursedIndices++;
                }
            }

            System.out.println(numOfCursedIndices);
            for (int i = 0; i < n; i++) {
                System.out.print(ans.get(i) + " ");
            }
            System.out.println();

        }
    }
}
