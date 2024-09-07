class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] shifter = new int[nums.length - k];
        int[] stayer = new int[k];
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - k) {
                shifter[i] = nums[i];
                nums[i] = shifter[i];
            } else {
                stayer[i - (nums.length - k)] = nums[i];
                nums[i] = stayer[i];
            }
        }
        System.arraycopy(stayer, 0, nums, 0, stayer.length);
        System.arraycopy(shifter, 0, nums, stayer.length, shifter.length);
    }
}