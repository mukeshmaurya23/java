public class pangram {
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";
        s = s.toLowerCase();
        String str = "";
        for (char c = 'a'; c <= 'z'; c++) {
            str += c;
        }
        System.out.println(str);
        for (int i = 0; i < str.length(); i++) {
            if (s.indexOf(str.charAt(i)) == -1) {
                System.out.println("Not pangram");
                return;
            }
        }
        System.out.println(" Pangram");

    }
}