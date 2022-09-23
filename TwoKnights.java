/**
 * <a href=https://cses.fi/problemset/submit/1072/></a>
 */

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class TwoKnights {
    public static long calculateWays(long n) {
        long nsq = n * n;
        return (nsq * (nsq - 1) >> 1) - ((n - 1) * (n - 2) << 2);
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(System.out);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        for (int i = 1; i <= n; i++) {
            bufferedWriter.write(calculateWays(i) + "\n");
            bufferedWriter.flush();
        }
        bufferedWriter.close();
        outputStreamWriter.close();
    }
}
