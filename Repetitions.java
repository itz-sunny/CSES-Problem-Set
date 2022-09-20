import java.util.Scanner;

/**
 * @see <a href=https://cses.fi/problemset/task/1069>Repitions</a>
 */
class Repetitions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 1, n = s.length(), result = 0;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == s.charAt(i - 1))
                count++;
            else {
                result = Math.max(count, result);
                count = 1;
            }
        }
        System.out.println(Math.max(result, count));
    }
}
