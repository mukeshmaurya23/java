public class reverseString {
    public static void main(String[] args) {
        String str = "abc";
        char c;
        for (int i = str.length() - 1; i >= 0; i--) {
            c = str.charAt(i);
            System.out.println(c);
        }
    }
}
