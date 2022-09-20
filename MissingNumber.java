import java.util.Scanner;

/**
 * @see <a href=https://cses.fi/problemset/task/1083>Missing Number</a>
 */
class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = n;
        sum = sum * (sum + 1) >> 1;
        for (int i = 1; i < n; i++) {
            sum -= sc.nextInt();
        }
        System.out.println(sum);
    }
}
