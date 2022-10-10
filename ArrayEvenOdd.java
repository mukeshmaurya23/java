public class ArrayEvenOdd {

    public static void evenodd(int a[]) {
        int arr[] = new int[a.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (a[i] % 2 == 0) {
                arr[index] = a[i];
                index++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (a[i] % 2 != 0) {
                arr[index] = a[i];
                index++;
            }
        }
        for (int x : arr) {
            System.out.print(x + " ");
        }

    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 5, 4, 3, 7, 8, 11, 20 };
        evenodd(arr1);

    }

}
