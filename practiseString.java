public class practiseString {
    public static void reverseString(char[] s) {
        String rev = "";
        for (int i = 0; i < s.length; i++) {
            rev = s[i] + rev;
        }
        s = rev.toCharArray();
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }

    }

    public static void main(String[] args) {
        char arr[] = { 'h', 'e', 'l', 'l', 'o' };

        reverseString(arr);
    }
}
