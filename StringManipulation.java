public class StringManipulation {
    public static void main(String[] args) {
        /*
         * Given a String S, reverse the string without reversing its individual words.
         * Words are separated by dots.
         */
        String S = "i.like.this.program.very.much";
        String[] words = S.split("\\.");
        String result = "";
        for (int i = words.length - 1; i >= 0; i--) {
            result += words[i];
            if (i != 0) {
                result += ".";
            }
        }
        System.out.println(result);

    }
}
