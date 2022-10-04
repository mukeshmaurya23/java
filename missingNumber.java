//import java.util.Arrays;

public class missingNumber {
    public static void main(String[] args) {
        // find missing number in array
        // int a[] = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
        // int sum = 0;
        // for (int i = 0; i < a.length; i++) {
        // sum = sum + a[i];
        // }
        // System.out.println(sum);
        // int sum1 = 0;
        // for (int i = 1; i <= 10; i++) {
        // sum1 = sum1 + i;
        // }
        // System.out.println(sum1);
        // System.out.println("Missing number is " + (sum1 - sum));

        // find n missing number in array
        // two missing number in array
        int a[] = { 1, 3, 2, 3, 4, 5, 5, 4, 8, 9, 10 };
        int j = 0;
        int size = a.length;
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            for (int k = i + 1; k < a.length; k++) {
                if (a[i] > a[k]) {
                    temp = a[i];
                    a[i] = a[k];
                    a[k] = temp;
                }
            }
            // System.out.print(a[i] + " ");
        }
        // or Arrays.sort(a)
        for (int i = 0; i < size - 1; i++) {
            if (a[i] == a[i + 1]) {
                // a[j++] = a[i];
                System.out.println("Duplicate number is " + a[i]);
            }
        }

        // a[j++] = a[size - 1];
        // for (int k = 0; k < j; k++) {
        // System.out.print(a[k] + " ");
        // }

        // swap aray without using temp
        // int a[] = { 1, 5, 9 };
        // int b[] = { 4, 7, 8 };

        // System.out.println("Before Sorting A");
        // for (int l : a) {
        // System.out.print(l + " ");
        // }
        // System.out.println(" ");
        // System.out.println("Before Sorting B");
        // for (int m : b) {
        // System.out.print(m + " ");
        // }
        // for (int i = 0; i < 3; i++) {
        // a[i] = a[i] ^ b[i];
        // b[i] = a[i] ^ b[i];
        // a[i] = a[i] ^ b[i];
        // }
        // //

        // System.out.println("After Sorting A");
        // for (int l : a) {
        // System.out.print(l + " ");
        // }
        // System.out.println(" ");
        // System.out.println("After Sorting B");
        // for (int m : b) {
        // System.out.print(m + " ");
        // }
    }
}
