import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int n, f = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        n = sc.nextInt();
        /* for int i=1 i<=n i++ */
        int i = 1;
        while (i <= n) {
            f = f * i;
            i++;
        }
        System.out.println(f);
        sc.close();
    }
}
