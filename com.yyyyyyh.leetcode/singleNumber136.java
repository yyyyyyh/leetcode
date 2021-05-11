/**
 * [136. 只出现一次的数字](https://leetcode-cn.com/problems/single-number/)
 */
public class singleNumber136 {

    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

}
