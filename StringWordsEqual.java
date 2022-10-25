public class StringWordsEqual {

    static boolean StringEqual(String word1[], String word2[]) {
        // String word[] = new String[word1.length];

        // System.out.println(word1.length);

        // System.out.println(word.length);
        String str = "";
        String str1 = "";

        for (int i = 0; i < word1.length; i++) {
            str = str + word1[i];
        }
        for (int i = 0; i < word2.length; i++) {
            str1 = str1 + word2[i];
        }
        // System.out.println(str1);
        if (str.equals(str1)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String word1[] = { "ab", "c" };
        String word2[] = { "a", "bc" };

        System.out.println(StringEqual(word1, word2));
    }
}
