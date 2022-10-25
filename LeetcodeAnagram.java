import java.util.Arrays;

public class LeetcodeAnagram {
    static int kthLargest(int arr[], int k) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        return arr[arr.length - k];// 4-2 =2
    }

    public static void main(String[] args) { // 4 -2 2 0 1 2

        int arr[] = { 10, 5, 23, 8 };// 5,8,10,23 4 -1 =3
                                     // 0,1, 2, 3
        int k = 2;
        // sort in reverse order
        System.out.println(kthLargest(arr, k));

    }
}
