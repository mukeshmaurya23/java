public class commonElement {

    static void commonNumbers(int arr1[], int arr2[]) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    // check even or odd
                    if (arr1[i] % 2 == 0) {
                        System.out.println("Even " + arr1[i] + " ");
                    }
                    if (arr1[i] % 2 != 0) {
                        System.out.println("Odd " + arr1[i] + " ");
                    }

                }
            }
        }
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 6 };
        int arr2[] = { 2, 3, 4, 5, 6, 7 };
        commonNumbers(arr1, arr2);
    }
}
