class Solution2 {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (set.add(nums[i]) == false) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        return set.stream().findFirst().orElse(-1);
    }
}