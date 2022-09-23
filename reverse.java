import java.util.*;;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n, rev = 0, r;
        n = sc.nextInt();
        int p = n;
        while (n > 0) {
            r = n % 10;
            rev = rev * 10 + r;// 123 %10 3 0*10+3=3 32 32*10+1 320+1=321
            n = n / 10;
        }
        System.out.println(rev);
        if (p == rev) {
            System.out.println(p + "is pallindrome");
        } else {
            System.out.println(p + "is not pallindrome");
        }
        sc.close();
    }
}
