import java.util.Random;
import java.util.Scanner;

/**
 * @see <a href=https://cses.fi/problemset/task/1070>Permutations</a>
 */
public class Permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 2 || n == 3) {
            System.out.println("NO SOLUTION");
        } else {
            StringBuilder front = new StringBuilder();
            StringBuilder back = new StringBuilder();

            for (int i = 2; i <= n; i+=2) {
                front.append(i).append(' ');
            }

            for (int i = 1; i <= n; i+=2) {
                back.append(i).append(' ');
            }

            front.append(back);

            System.out.println(front);
        }
    }
}
