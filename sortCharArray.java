public class sortCharArray {
    public static void main(String[] args) {
        // sort the char array without using sort method
        char[] ch = { 'f', 'b', 'd', 'o', 'u' };
        char temp;
        for (int i = 0; i < ch.length; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] > ch[j]) {
                    temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i] + " ");
        }

    }
}
