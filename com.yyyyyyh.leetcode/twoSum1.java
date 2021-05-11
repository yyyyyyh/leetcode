/**
 * [1. 两数之和](https://leetcode-cn.com/problems/two-sum/)
 */
public class twoSum1 {

    public int[] twoSum(int[] nums, int target) {
        int first = 0, second = 1;
        while(nums[first] + nums[second] != target){
            if(second == (nums.length - 1)){
                first++;
                second = first;
            }
            second++;
        }

        return new int[]{first, second};
    }

}
