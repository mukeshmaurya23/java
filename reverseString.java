public class reverseString {
    public static void main(String[] args) {
        String str = "abc";
        String rev = "";
        // char c;
        for (int i = str.length() - 1; i >= 0; i--) {
            // c = str.charAt(i);
            rev = rev + str.charAt(i);

        }
        System.out.println(rev);
        if (str.equals(rev)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}
