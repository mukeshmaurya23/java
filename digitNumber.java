import java.util.*;

public class digitNumber {
    public static void main(String[] args) {
        int n, t, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        n = sc.nextInt();
        while (n != 0) {
            t = n % 10;
            n = n / 10;
            // count++;
            System.out.println(t);
        }

        sc.close();
    }
}
