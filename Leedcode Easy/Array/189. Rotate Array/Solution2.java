class Solution2 {

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int last = nums[n - 1];
        int[] lastArray = new int[k];

        for (int i = n - 1; i >= 0; i--) {
            last = nums[i % n];

            if (i >= k) {
                if (i >= k && k + i - n >= 0) {
                    lastArray[k + i - n] = last;
                }
                nums[i] = nums[i - k];

            } else {

                if (k + i - n >= 0) {
                    lastArray[k + i - n] = last;
                }

                nums[i] = lastArray[i];

            }
        }

    }

}