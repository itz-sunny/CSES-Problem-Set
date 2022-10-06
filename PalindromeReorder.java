import java.io.*;
import java.util.Arrays;

/**
 * <a href=https://cses.fi/problemset/task/1755>Palindrome Reorder</a>
 */
public class PalindromeReorder {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(System.out))) {
            char[] array = bufferedReader.readLine().toCharArray();
            int[] f = new int[26];
            for (char c : array) ++f[c - 'A'];
            int odds = 0, start = 0, end = array.length - 1;
            char midChar = '.';
            for (int i = 0; i < 26; i++) {
                if ((f[i] & 1) == 1) {
                    if (++odds > 1) {
                        printWriter.print("NO SOLUTION");
                        return;
                    }
                    midChar = (char)('A' + i);
                }
            }
            for (int i = 0; i < 26; i++) {
                if (f[i] > 0) {
                    int n = f[i] >> 1;
                    char c = (char)('A' + i);
                    while (n-- > 0) array[start++] = array[end--] = c;
                }
            }
            if (midChar != '.')
                array[array.length >> 1] = midChar;
            printWriter.print(new String(array));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
