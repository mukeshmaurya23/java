import java.util.*;

public class multiplication {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        n = sc.nextInt();

        // for (int i = 1; i <= 10; i++) {
        // System.out.println(n + "*" + i + "=" + n * i);
        // }
        // int i = 1;
        // while (i <= n) {
        // sum = sum + i;
        // i++;
        // }
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);

        sc.close();
    }
}
