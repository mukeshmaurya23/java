public class StringPallindromeLeetcode {
    static boolean pallindrome(String str) {
        // remove , . and space from string
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        // str = str.replaceAll("\\s", "");
        // System.out.println(str);

        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);

        }
        if (str.equals(rev)) {
            return true;
        }

        // System.out.println(rev);

        return false;
    }

    public static void main(String[] args) {
        String str = "";
        System.out.println(pallindrome(str));
    }
}