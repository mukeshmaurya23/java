import java.util.*;

public class commonArray {
    public static void main(String[] args) {
        // int arr1[] = { 2, 4, 5, 6, 8, 3 };
        // 0 1 2 3 4 5
        String arr1[] = { "bob", "cat", "abc" };

        // int arr2[] = { 4, 3, 2, 9, 12, 8 };
        // 0 1 2 3 4 5
        String arr2[] = { "bob", "xyz", "abc" };

        findComman(arr1, arr2);
    }

    static void findComman(String arr1[], String arr2[]) {

        // Arrays.sort(arr1);
        // Arrays.sort(arr2);
        // 2 3 4 5 6 8
        // 2 3 4 8 9 12

        HashSet<String> s = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            s.add(arr1[i]);

        }

        for (int j = 0; j < arr2.length; j++) {
            if (s.contains(arr2[j])) {
                System.out.print(arr2[j] + " ");
            }
        }

    }
}