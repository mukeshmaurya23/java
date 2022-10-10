public class lexciograpphically {
    public static void main(String[] args) {

        /*
         * Bob gave alex a string consisting of lowercase english letter of lenght n. He
         * then
         * asked alex to construct a new string s1 by using the characters of s such
         * that the
         * no two character appear more then k times consecutively. it is not
         * mandatory to use all the characters of s. Help alex to find the
         * lexicographically
         * largest string s1 that can be constructed using the given conditions.
         */

        // find lexicographically largest possible string s1
        // input 7 3
        // ddybydd
        // output: yydddbd

        int k = 3;
        String s = "dddybydd";
        int n = s.length();
        int count = 0;
        int index = 0;
        char[] a = new char[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                a[index] = s.charAt(i);
                index++;
                count++;
            } else if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
                if (count <= k) {
                    a[index] = s.charAt(i);
                    index++;
                }
            } else {
                count = 1;
                a[index] = s.charAt(i);
                index++;
            }
        }
        for (int i = 0; i < index; i++) {
            System.out.print(a[i]);
        }
    }
}
