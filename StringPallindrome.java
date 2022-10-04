import java.util.*;

public class StringPallindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String name to check pallindrome:");

        String str = sc.nextLine();
        // int a = str.length() - 1;
        // m a d a m
        // 0 1 2 3 4
        // if we do int a=str.length() //op 5 but string and array index start from 0
        // so index will be 0 1 2 3 4 and str.length() return 5 so first make -1 so it
        // will return now 4
        // make >=0 so it will iterate over 0th index

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.println(str.charAt(i));
        }
        // System.out.println(a);

        // String rev = "";
        // for (int i = str.length(); i > 0; i--) {
        // rev = rev + str.charAt(i);
        // }
        // if (str.equals(rev)) {
        // System.out.println("Pallindrome");
        // } else {
        // System.out.println("Not pallindrome");
        // }
        sc.close();

    }
}
