// import java.util.Arrays;

public class StringArray {
    public static void main(String[] args) {
        String arr[] = { "java", "python", "c++", "ada", "pascal" };

        java.util.Arrays.sort(arr);
        // for (String x : arr) {
        // System.out.println(x);
        // }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
