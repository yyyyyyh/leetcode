import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * [剑指 Offer 50. 第一个只出现一次的字符](https://leetcode-cn.com/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof/)
 */
public class DiYiGeZhiChuXianYiCiDeZiFuLcof50 {

    @Test
    public void test7(){
        System.out.println(firstUniqChar("leetcode"));
    }

    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Boolean> hashMap = new HashMap<>();

        for (int i = 0; i < chars.length; i++) {
            hashMap.put(chars[i], hashMap.containsKey(chars[i]));
        }
        for (int i = 0; i < chars.length; i++) {
            if(!hashMap.get(chars[i])){
                return i;
            }
        }

        return -1;
    }

}
