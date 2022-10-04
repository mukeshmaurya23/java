public class StringReverse {
    public static void main(String[] args) {
        String str = "Aukesh";
        // 0 1 2 3 4 5
        str = str.toLowerCase();
        // char ch[] = { 'a', 'e', 'i', 'o', 'u' };
        // 0 1 2 3
        // System.out.println(str.length());
        int count = 0;
        int c = 0;
        // String str2 = new String(ch);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                // System.out.print(str.charAt(i) + " ");

                count++;
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                System.out.print(" " + str.charAt(i) + " ");
                c++;
            }

        }
        System.out.println(count);
        System.out.println(c);

        // String str1 = "";

        // for (int i = str.length() - 1; i >= 0; i--) {
        // str1 += str.charAt(i);
        // }
        // System.out.println(str1);
    }
}
