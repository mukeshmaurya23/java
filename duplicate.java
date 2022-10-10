public class duplicate {
    public static void main(String[] args) {
        // remove duplicate from array
        int arr[] = { 22, 23, 23, 45, 45 };

        int size = arr.length;
        int l = 0;
        int temp = 0;
        java.util.Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        // 22 23 23 45 45
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[l++] = arr[i];
            }
        }
        // 22 23 23 22 45
        // 22 23
        arr[l++] = arr[size - 1];
        System.out.println("********************************");
        for (int k = 0; k < l; k++) {
            System.out.println(arr[k]);
        }
    }
}
