public class LargestUsingVarargs {

    static int max(int... A) {
        if (A.length == 0) {
            return Integer.MIN_VALUE;
        }
        // int max = A[0];
        // for (int i = 0; i < A.length; i++) {
        // if (A[i] > max) {
        // max = A[i];
        // }

        // }
        // return max;
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum = sum + A[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(max(10, 60));
    }
}
