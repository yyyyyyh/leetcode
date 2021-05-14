/**
 * [7. 整数反转](https://leetcode-cn.com/problems/reverse-integer/)
 */
public class reverseInteger7 {

    public static void main (String[] args) {
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int x) {
        long result = 0;
        while(x != 0){
            result = result * 10 + x%10;
            x /= 10;
        }

        return (int)result == result ? (int)result : 0;
    }

}
