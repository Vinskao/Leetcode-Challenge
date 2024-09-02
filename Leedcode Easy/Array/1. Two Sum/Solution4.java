import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class Solution4 {
    public static void main(String[] args) {
        int[] nums = { 7, 0, 8, 5 };
        int[] result = twoSum(nums, 13);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                result[0] = i;
                result[1] = map.get(complement);
                return result;
            } else {
                map.put(nums[i], i);
                System.out.println(nums[i]);
            }
        }
        return null;
    }
}