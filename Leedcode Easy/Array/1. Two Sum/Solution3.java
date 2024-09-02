import java.util.Arrays;

public class Solution3 {
    public static void main(String[] args) {
        int[] nums = { 7, 7, 4, 3 };
        int[] result = twoSum(nums, 11);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            System.out.println("i " + i);
            for (int j = 0; j < nums.length; j++) {
                System.out.println("j " + i);
                if (nums[i] + nums[j] == target && i != j) {
                    System.out.println("inner i " + i);
                    System.out.println("inner j " + j);

                    result[0] = i;
                    result[1] = j;
                    return result;
                } else {
                    continue;
                }
            }
        }
        return null;
    }

}