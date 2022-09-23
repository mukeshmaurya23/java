public class Matrix {
    public static void main(String[] args) {
        int A[][] = { { 3, 5, 9 }, { 7, 6, 2 }, { 4, 3, 5 } };
        int B[][] = { { 1, 5, 2 }, { 6, 8, 4 }, { 3, 9, 7 } };

        int C[][] = new int[3][3];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }

        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                // System.out.format("%02d ", C[i][j] + " ");
                System.out.print(C[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}
