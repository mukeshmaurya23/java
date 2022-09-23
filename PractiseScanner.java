import java.lang.*;
import java.util.*;

public class PractiseScanner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // System.in to read the value from keyboard
        // int a, b, c;
        // System.out.println("Enter the Two Number");
        // a = s.nextInt();
        // b = s.nextInt();
        // c = a + b;
        // System.out.println("Sum is " + c);
        // System.out.println("Enter the String");
        // String str = s.nextLine();
        // System.out.println(str);
        // float a, b, c;
        // System.out.println("Enter the Two Number");
        // a = s.nextFloat();
        // b = s.nextFloat();
        // c = a + b;
        // System.out.println("Sum is " + c);
        // System.out.println("Enter the binary Number");
        // s.useRadix(2);
        // int a = s.nextInt();
        // System.out.println(a);
        System.out.println("Enter the binary Number");
        s.useRadix(2);
        int a = s.nextInt();
        System.out.println(a);
    }
}