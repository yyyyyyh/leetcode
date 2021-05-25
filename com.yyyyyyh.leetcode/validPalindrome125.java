import org.junit.Test;

/**
 * [125. 验证回文串](https://leetcode-cn.com/problems/valid-palindrome/)
 */
public class validPalindrome125 {

    @Test
    public void test7(){
        isPalindrome("A man, a plan, a canal: Panama");
    }

    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while(left < right){
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

}
