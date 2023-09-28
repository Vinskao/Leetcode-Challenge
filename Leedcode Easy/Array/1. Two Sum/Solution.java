public class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        for(int i = 0; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++){
                int complement = target - nums[i];

                if (nums[j] == complement){
                    return new int[] {i, j};
                }
            }
        }
        throw new IllegalArgumentException("Invalid solution");
    }

    public static void main(String[] args){
        Solution solution = new Solution();
        int[] nums = { 2 , 7 , 11 , 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);

        System.out.println("Indices: " + result[0] + ',' + result[1]);
    }
}