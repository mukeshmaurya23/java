import java.util.*;

public class perfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the start range:");
        int n1 = sc.nextInt();
        System.out.println("Enter the last range:");
        int n2 = sc.nextInt();

        int j = 1;
        for (int i = n1; i <= n2; i++) {
            // 1 1<=20 i=1 j=1 1<=1 1*1=1 1 2 2<=20 2*2 4 <=2
            while (j * j <= i) {
                if (j * j == i) {
                    System.out.println(i);
                }
                j++;
            }
        }

        sc.close();
    }
}
