import java.util.Arrays;

/**
 * [350. 两个数组的交集 II](https://leetcode-cn.com/problems/intersection-of-two-arrays-ii/)
 */
public class intersectionOfTwoArraysIi350 {

    public int[] intersect2(int[] nums1, int[] nums2) {
        int minLength = nums1.length > nums2.length ? nums2.length : nums1.length;
        int[] result = new int[minLength];

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int temp = 0;
        for (int index1 = 0, index2 = 0; index1 < nums1.length && index2 < nums2.length; ) {
            if(nums1[index1] == nums2[index2]){
                result[temp++] = nums1[index1];
                ++index1;
                ++index2;
            }else if(nums1[index1] < nums2[index2]){
                ++index1;
            }else{
                ++index2;
            }
        }

        return Arrays.copyOfRange(result, 0, temp);
    }

}
