import java.util.*;

public class thirdLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        int arr[] = new int[n];
        // int c;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + i + " element ");
            arr[i] = sc.nextInt();
        }

        // now sort the element
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            // System.out.println("********************");

        }
        System.out.println("********************");
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
        int size = arr.length;
        System.out.println("Third Largest" + arr[size - 1]);

        // third largest

        sc.close();
    }
}
