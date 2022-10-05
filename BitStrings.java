/**
 * <a href=https://cses.fi/problemset/task/1617/>Bit Strings</a>
 */

import java.util.Scanner;

public class BitStrings {
    private final  static int M = 1000000007;

    public static long modExp(long x, int n) {
        long res = 1;
        while (n > 0) {
            if ((n & 1) == 1)
                res = (res * x) % M;
            x = (x * x) % M;
            n >>= 1;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(modExp(2, n));
    }
}
