
public class missingNumber {

    static int missNumber(int arr[]) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum1 += arr[i];
        }
        for (int i = 1; i <= arr.length; i++) {
            sum2 += i;
        }
        return sum2 - sum1;

    }

    public static void main(String[] args) {
        int arr[] = { 4, 0, 2, 1, 5 };
        System.out.print(missNumber(arr) + " ");

    }
}
