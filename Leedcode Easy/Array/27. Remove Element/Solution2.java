import java.util.Arrays;

public class Solution2 {
    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 2 };
        int result = removeDuplicates(nums);
        System.out.println(result);
    }

    public static int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                nums[k] = nums[i];
                k++;
            } else if (nums[i] != nums[i - 1] || (nums[i] == 0 && nums[i - 1] != 0)) {
                nums[k] = nums[i];
                k++;
            }
        }
        nums = Arrays.copyOf(nums, k);
        System.out.println(Arrays.toString(nums));
        return k;
    }
}
