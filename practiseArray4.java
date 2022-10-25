public class practiseArray4 {
    static int[] sameNumber(int nums[], int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && nums[i] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };

    }

    public static void main(String[] args) {
        int arr[] = { 5, 5, 11, 15 };
        int target = 5;
        System.out.println(java.util.Arrays.toString(sameNumber(arr, target)));

    }
}
