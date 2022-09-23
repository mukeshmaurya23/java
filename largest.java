
import java.util.*;

public class largest {
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
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; //
            }
        }
        // smallest number from array
        int min = arr[0];
        // 3 4 6 8
        // min=3
        // inside loop min<arr[i] 3<=3 min =arr[i] 3>=2
        System.out.println("********************");
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                // arr[i]>min 23>0 23 45>23
            }
        }
        System.out.println("********************");

        System.out.println("Smallest Value:" + min);
        System.out.println("Largest Value:" + max);
        System.out.println("************************");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}
