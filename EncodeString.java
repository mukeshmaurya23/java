public class EncodeString {
    static void encode(String str) {
        int count = 1;
        for (int i = 0; i < str.length(); i++) {

            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                System.out.print(str.charAt(i));
                System.out.print(count);
                count = 1;
            }
            // if (i == str.length() - 2) {
            // System.out.print(str.charAt(i + 1) + "" + count);
            // // System.out.print(str.charAt(i + 1) + "" + 1);
            // }

            // extract last character and count
            // System.out.println(str.length());

        }
    }

    public static void main(String[] args) {
        String str = "aaabbbcc";// 8
        // 7 01234567
        encode(str);

    }
}
