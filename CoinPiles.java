import java.io.*;

/**
 * <a href=https://cses.fi/problemset/task/1754>Coin Piles</a>
 * a = x + 2y
 * b = 2x + y
 * a + b = 3(x + y)
 */
public class CoinPiles {
    public static boolean solve(int a, int b) {
        if (a < b)
            return solve(b, a);
        return a <= (b << 1) && (a + b) % 3 == 0;
    }

    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(System.out))) {
            int t = Integer.parseInt(bufferedReader.readLine());
            while (t-- > 0) {
                String[] params = bufferedReader.readLine().split(" ");
                printWriter.println(solve(Integer.parseInt(params[0]), Integer.parseInt(params[1])) ? "YES" : "NO");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
