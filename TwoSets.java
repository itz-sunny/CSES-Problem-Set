/**
 * <a href=https://cses.fi/problemset/task/1092/>Two Sets</a>
 */

import java.io.*;
import java.util.*;

public class TwoSets {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(System.out);
        PrintWriter printWriter = new PrintWriter(outputStreamWriter);
        int n = sc.nextInt();
        long sum = ((long) n * (n + 1)) >> 1;

        if ((sum & 1) == 1) {
            printWriter.println("NO");
        } else {
            List<Integer> first = new ArrayList<>();
            List<Integer> second = new ArrayList<>();
            if ((n & 1) == 0) {
                boolean flip = true;
                for (int i = 1; i <= (n >> 1); i++) {
                    if (flip) {
                        first.add(i);
                        first.add(n - i + 1);
                    } else {
                        second.add(i);
                        second.add(n - i + 1);
                    }
                    flip ^= true;
                }
            } else {
                boolean[] visited = new boolean[n + 1];
                long rem = sum / 2;
                for (int i = n; i >= 1; i--) {
                    if (rem > i) {
                        first.add(i);
                        visited[i] = true;
                        rem -= i;
                    } else {
                        visited[(int)rem] = true;
                        first.add((int)rem);
                        break;
                    }
                }

                for (int i = 1; i <= n; i++) {
                    if (!visited[i]) {
                        second.add(i);
                    }
                }
            }
            printWriter.println("YES");
            printWriter.println(first.size());
            first.forEach(e -> printWriter.println(e + " "));
            printWriter.println(second.size());
            second.forEach(e -> printWriter.println(e + " "));
        }
        printWriter.close();
        outputStreamWriter.close();
        sc.close();
    }
}
