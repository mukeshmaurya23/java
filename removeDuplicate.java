import java.util.*;

public class removeDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();
        }
        int size = arr.length;
        int j = 0;
        Arrays.sort(arr);
        // 22 23 23 45 45
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }

        }
        // 22 23 23 22 45
        // 22 23
        arr[j++] = arr[size - 1];
        System.out.println("********************************");
        for (int k = 0; k < j; k++) {
            System.out.println(arr[k]);
        }
        sc.close();
    }
}
