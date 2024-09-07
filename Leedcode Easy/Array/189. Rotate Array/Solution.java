class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] shifter = new int[nums.length - k];
        int[] stayer = new int[k];

        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - k) {
                shifter[i] = nums[i];
            } else {
                stayer[i - (nums.length - k)] = nums[i];
            }
        }

        for (int i = 0; i < k; i++) {
            nums[i] = stayer[i];
        }

        for (int i = 0; i < nums.length - k; i++) {
            nums[i + k] = shifter[i];
        }
    }
}