public class reverseWord {
    public static void main(String[] args) {
        // reverse each word in a string
        String s = "I love java";
        String[] words = s.split(" ");
        // System.out.println(words);

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            // System.out.print(word + " ");
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord += word.charAt(j);
            }
            System.out.print(reverseWord + " ");
        }

    }
}
