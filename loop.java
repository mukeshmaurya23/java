public class loop {
    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 8, 9 };
        System.out.println(arr.length);
        // 0 1 2 3 4
        for (int i = 0; i < arr.length - 2; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
