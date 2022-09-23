import java.util.*;

public class secondLargest {
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
        int max1, max2;
        max1 = max2 = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2) {

                max2 = arr[i];
            }
        }
        System.out.println("Second largest:" + max2);
        sc.close();
    }
}
