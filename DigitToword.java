import java.util.*;

public class DigitToword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        // agar kabhi bhi number ko words mai karna hai toh pahele usko string mai banao
        // phir charat se uska char extract karo
        int n, r;
        n = sc.nextInt();
        String str = "";
        while (n > 0) {
            r = n % 10;
            n = n / 10;
            str = str + r;
        }
        char c;
        // System.out.println(str);
        for (int i = str.length() - 1; i >= 0; i--) {
            c = str.charAt(i);
            switch (c) {
                case '0':
                    System.out.print("Zero ");
                    break;
                case '1':
                    System.out.print("One ");
                    break;
                case '2':
                    System.out.print("Two ");
                    break;
                case '3':
                    System.out.print("Three ");
                    break;
                case '4':
                    System.out.print("four ");
                    break;
                case '5':
                    System.out.print("five ");
                    break;
                case '6':
                    System.out.print("six ");
                    break;
                case '7':
                    System.out.print("seven ");
                    break;
                case '8':
                    System.out.print("eight ");
                    break;
                case '9':
                    System.out.print("nine ");
                    break;
                default:
                    System.out.print("Invalid");

            }
        }
        sc.close();
    }
}
