import java.util.*;;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int a = 0, b = 1, c;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for (int i = 0; i < n - 2; i++) {

            // System.out.print(b + " ");
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

        sc.close();
    }
}
// 0 1 1 2 3 5