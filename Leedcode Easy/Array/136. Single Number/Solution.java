class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
            list.add(nums[i]);
        }
        List<Integer> singleList = new ArrayList<>(set);

        for (int i = 0; i < set.size(); i++) {
            list.remove(singleList.get(i));
        }

        for (int i = 0; i < set.size(); i++) {
            if (singleList.size() > 1) {
                singleList.remove(list.get(i));
            } else {
                continue;
            }
        }
        return singleList.get(0);
    }
}