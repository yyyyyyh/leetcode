import org.junit.Test;

/**
 * [242. 有效的字母异位词](https://leetcode-cn.com/problems/valid-anagram/)
 */
import java.util.Arrays;

public class ValidAnagram242 {

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] sc = s.toCharArray();
        Arrays.sort(sc);
        char[] tc = t.toCharArray();
        Arrays.sort(tc);
        for (int i = 0; i < sc.length && i < tc.length; i++) {
            if(sc[i] != tc[i]){
                return false;
            }
        }

        return true;
    }

    @Test
    public void test26(){
        System.out.println('b' - 'a');
    }

    public boolean isAnagram2(String s, String t){
        if (s.length() != t.length())
            return false;
        int[] letterCount = new int[26];
        for (int i = 0; i < s.length(); i++)
            letterCount[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++)
            letterCount[t.charAt(i) - 'a']--;
        for (int count : letterCount)
            if (count != 0)
                return false;
        return true;
    }

}
