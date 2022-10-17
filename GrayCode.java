import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * <a href=https://cses.fi/problemset/task/2205>Gray Code</a>
 */
public class GrayCode {
    public static List<String> generate(int n) {
        if (n == 0) {
            return List.of("");
        }
        List<String> previous = generate(n - 1);
        List<String> current = new ArrayList<>();
        int size = previous.size();

        for (String el : previous) {
            current.add("0" + el);
        }

        for (int i = size - 1; i >= 0; i--) {
            current.add("1" + previous.get(i));
        }

        return current;
    }

    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             PrintWriter printWriter = new PrintWriter(System.out)) {
            int n = Integer.parseInt(bufferedReader.readLine());
            generate(n).forEach(printWriter::println);
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
