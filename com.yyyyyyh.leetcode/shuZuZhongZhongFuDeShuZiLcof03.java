import java.util.Arrays;

/**
 * [剑指 Offer 03. 数组中重复的数字](https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/)
 */
public class shuZuZhongZhongFuDeShuZiLcof03 {

    public int removeDuplicates(int[] nums) {
        int left = 0;
        for (int right = 1; right < nums.length; right++) {
            if(nums[right] != nums[left]){
                nums[++left] = nums[right];
            }
        }
        return ++left;
    }

    public int findRepeatNumber(int[] nums) {
        Arrays.sort(nums);

        int val = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == val){
                return val;
            }else{
                val = nums[i];
            }
        }

        return 0;
    }

}
