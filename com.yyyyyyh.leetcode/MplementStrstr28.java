import org.junit.Test;

/**
 * [28. 实现 strStr()](https://leetcode-cn.com/problems/implement-strstr/)
 */
public class MplementStrstr28 {

    @Test
    public void test7(){
        strStr("aaaaa", "baa");
    }

    /**
     * 根据 needle 的长度截取比较
     * @param haystack
     * @param needle
     * @return
     */
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty()){
            return 0;
        }
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            String substring = haystack.substring(i, i + needle.length());
            if(substring.equals(needle)){
                return i;
            }
        }

        return -1;
    }

    @Test
    public void test34(){
        System.out.println(dd("ababc"));
    }

    public int[] dd(String str){
        int[] result = new int[str.length()];
        int lastLen = 0;
        result[0] = -1;
        for (int i = 1; i < str.length() -1; i++) {
            if (str.charAt(lastLen) == str.charAt(i)){
                lastLen++;
            }else {
                lastLen = 0;
            }
            result[i] = lastLen;
        }

        return result;
    }

}
