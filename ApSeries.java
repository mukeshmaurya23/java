import java.util.*;

public class ApSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Starting term:");
        int a = sc.nextInt();
        System.out.println("Enter the common difference:");
        int b = sc.nextInt();
        System.out.println("Enter the nth term:");
        int n = sc.nextInt();
        int c = a;
        for (int i = 0; i < n; i++) {

            System.out.print(c + " ");
            c = c * b;

        }
        sc.close();
    }
}
