import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * <a href=https://cses.fi/problemset/task/2165>Tower Of Hanoi</a>
 */
public class TowerOfHanoi {
    public static void solve(int n, int src, int aux, int dest, List<String> result) {
        if (n > 0) {
            solve(n - 1, src, dest, aux, result);
            result.add(src + " " + dest);
            solve(n - 1, aux, src, dest, result);
        }
    }

    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             PrintWriter printWriter = new PrintWriter(System.out)) {
            int n = Integer.parseInt(bufferedReader.readLine());
            List<String> result = new ArrayList<>();
            solve(n, 1, 2, 3, result);
            printWriter.println(result.size());
            result.forEach(printWriter::println);
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
