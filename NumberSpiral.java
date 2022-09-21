import java.io.*;

/**
 * <a href=https://cses.fi/problemset/task/1071>Number Spiral</a>
 * clockwise + rowTraversal -> maxSquare - row + 1
 * clockwise + colTraversal -> maxSquare - 2 * max - 2 + col
 * anticlockwise + rowTraversal -> maxSquare - 2 * max - 2 + row
 * anticlockwise + colTraversal -> maxSquare - col + 1
 */
public class NumberSpiral {
    public static long calculate(long r, long c) {
        long layer = Math.max(r, c);
        long min = Math.min(r, c);
        long result = layer * layer;
        boolean rowTraversal = layer == c;
        boolean clockwise = (layer & 1) == 1;

        if (clockwise ^ rowTraversal)
            result += -((layer - 1) << 1) + min - 1;
        else
            result -= min - 1;

        return result;
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(System.out);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

        int n = Integer.parseInt(bufferedReader.readLine());
        String line;

        for (int tc = 0; tc < n; tc++) {
            line = bufferedReader.readLine();
            String[] tokens = line.split(" ");
            int r = Integer.parseInt(tokens[0]);
            int c = Integer.parseInt(tokens[1]);
            bufferedWriter.write(calculate(r, c) + "\n");
            bufferedWriter.flush();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
