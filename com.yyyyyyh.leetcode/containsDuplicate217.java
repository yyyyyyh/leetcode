import java.util.Arrays;

/**
 * [217. 存在重复元素](https://leetcode-cn.com/problems/contains-duplicate/)
 */
public class containsDuplicate217 {

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i - 1]){
                return true;
            }
        }

        return false;
    }

}
