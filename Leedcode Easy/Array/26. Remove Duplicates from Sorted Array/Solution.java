import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int removeDuplicates(int[] nums) {

        if(nums.length == 0){
            return 0;
        }
        int j =1 ;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i-1]){
                nums[j] = nums[i];
                j++;
            }

        }
        System.out.println(j);

        return j;

    }

    public static void main(String[] args){

        Solution solution = new Solution();
        int[] nums = {1,5,6,10,10};
        int result = solution.removeDuplicates(nums);
        System.out.println(result);

    }
}




