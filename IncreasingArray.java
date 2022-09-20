import java.util.Scanner;

/**
 * @see <a href=https://cses.fi/problemset/task/1094>Increasing Array</a>
 */
public class IncreasingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), prev = sc.nextInt(), cur = 0;
        long result = 0;
        for (int i = 1; i < n; i++) {
            cur = sc.nextInt();
            if (cur < prev)
                result += prev - cur;
            else
                prev = cur;
        }
        System.out.println(result);
    }
}
