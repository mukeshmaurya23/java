public class evenArray {

    public static void even(int arr[]) {
        int a[] = new int[arr.length];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (arr[i] % 2 == 0) {
                a[index] = arr[i];
                index++;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (arr[i] % 2 != 0) {
                a[index] = arr[i];
                index++;
            }
        }
        for (int x : a) {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 7, 8, 10 };
        even(arr);

    }
}
