public class duplicate {
    public static void main(String[] args) {
        // remove duplicate from array
        int arr[] = { 1, 2, 2, 3, 4, 3 };
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                System.out.print(arr[i] + " ");
            }

        }
        System.out.print(arr[n - 1]);

    }

}

// // arr[l++] = arr[size - 1];
// System.out.println("********************************");
// for (int k = 0; k < l; k++) {
// System.out.println(arr[k]);
// }
// }
// }
