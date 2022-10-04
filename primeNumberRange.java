import java.util.*;

public class primeNumberRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the start range:");
        int n1 = sc.nextInt();
        System.out.println("Enter the last range:");
        int n2 = sc.nextInt();

        int p = 1;
        for (int i = n1; i <= n2; i++) {
            if (i == 1 || i == 0) {
                continue;
            }
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    p = 0;
                    break;
                }
            }
            if (p == 1) {
                System.out.println(i);
            }
            p = 1;

        }

        sc.close();
    }
}
