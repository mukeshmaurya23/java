public class tripLet1 {
    // practise loop and array
    public static void triplet(int n, int arr[]) { // int arr[] = { 5, 1, 3, 4, 7 }; 12
        int count = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            // System.out.print(arr[i] + " ");
            for (int j = i + 1; j < arr.length - 1; j++) {
                // System.out.print(arr[j] + " ");
                for (int k = j + 1; k < arr.length; k++) {
                    // System.out.print(arr[k] + " ");
                    if (arr[i] + arr[j] + arr[k] < n) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                        count++;

                    }
                }

            }
        }
        System.out.println(count);

    }

    public static void main(String[] args) {
        int arr[] = { 5, 1, 3, 4, 7 };
        int sum = 12;
        triplet(sum, arr);
    }
}
