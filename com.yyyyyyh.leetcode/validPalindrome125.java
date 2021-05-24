/**
 * [125. 验证回文串](https://leetcode-cn.com/problems/valid-palindrome/)
 */
public class validPalindrome125 {

    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while(left < right){
            if(left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            if(left < right && !Character.isLetterOrDigit(s.charAt(right))){
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
