import java.util.*;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n, r, sum = 0;
        n = sc.nextInt();
        int p = n;
        while (n > 0) {
            r = n % 10; // 153 %10 =3
            sum = sum + (r * r * r);
            n = n / 10;

        }
        if (p == sum) {
            System.out.println(p + "is Armstrong number");
        } else {
            System.out.println(p + " is not Armstrong number");
        }

        sc.close();
    }
}
