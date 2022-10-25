public class triplet {
    public static void main(String[] args) {

        // array triplet sum
        int[] arr = { 1, 4, 7, 9, 2, 1 };
        int sum = 12;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] <= sum) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);

    }
}
