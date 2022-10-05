import java.util.Scanner;

/**
 * <a href=https://cses.fi/problemset/task/1618>Trailing Zeros</a>
 */
public class TrailingZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), result = 0, fives = 5;
        while (fives <= n) {
            result += n / fives;
            fives *= 5;
        }
        System.out.println(result);
    }
}
