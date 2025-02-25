import java.util.*;

public class Main {
    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] b = new int[n - 2];
        for (int i = 0; i < n - 2; i++) {
            b[i] = sc.nextInt();
        }

        // Checking the validity of b
        for (int i = 0; i < n - 3; i++) {
            if (b[i] == 1 && b[i + 1] == 0 && b[i + 2] == 1) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
        sc.close();
    }
}
