/**
 * [344.反转字符](https://leetcode-cn.com/problems/reverse-string/)
 */
public class reverseString344 {

    public static void main (String[] args) {
        reverseString(new char[]{'a', 'b', 'c', 'd'});
    }

    public static void reverseString(char[] s) {
        int length = s.length;
        for (int i = 0, j = length - 1; i < length && j > i; i++, j--) {
            char begin = s[i];
            s[i] = s[j];
            s[j] = begin;
        }
    }

}
