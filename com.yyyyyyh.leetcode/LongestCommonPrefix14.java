import org.junit.Test;

/**
 * [14. 最长公共前缀](https://leetcode-cn.com/problems/longest-common-prefix/)
 */
public class LongestCommonPrefix14 {
    @Test
    public void test6(){
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }

    public String longestCommonPrefix(String[] strs) {
        String str = "";
        int index = 0;
        Character last = null;
        for (int i = 0; i < strs.length; i++) {
            String subStr = strs[i];
            if(subStr.length() > index){
                if(i == 0){
                    last = subStr.charAt(index);
                }else if(subStr.charAt(index) != last){
                    return str;
                }
            }else{
                return str;
            }

            if(i == strs.length - 1){
                str += last;
                i = -1;
                last = null;
                index++;
            }
        }

        return str;
    }

}
