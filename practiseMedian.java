import java.util.Arrays;

public class practiseMedian {

    static double median(int arr[], int num[]) {
        int c[] = new int[arr.length + num.length];
        for (int i = 0; i < arr.length; i++) {
            c[i] = arr[i];
        }
        System.out.println(arr.length);
        // System.out.println(c.length);
        for (int i = 0; i < num.length; i++) {
            c[arr.length + i] = num[i];
        }
        Arrays.sort(c);
        // System.out.println(c.length);
        if (c.length % 2 == 0) {
            // c[]= 1 2 3 4 length =4 4 c[4/2-1] c[1] and c[1 is 2]
            // 0 1 2 3
            float a = c[(c.length / 2) - 1];
            float b = c[c.length / 2];
            return (a + b) / 2;

        } else {

            return c[c.length / 2];

        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2 };
        int nums[] = { 3 };
        System.out.println(median(arr, nums));
    }
}
