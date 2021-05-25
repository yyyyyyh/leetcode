import org.junit.Test;

public class BaZiFuChuanZhuanHuanChengZhengShuLcof67 {

    @Test
    public void test4(){
        System.out.println(strToInt("9223372036854775808"));;
    }

    public int strToInt(String str) {
        str = str.trim();
        if(str.length() == 0){
            return 0;
        }
        boolean flag = true;
        int i = 0;
        if(str.charAt(0) == '+' || str.charAt(0) == '-'){
            i = 1;
            flag = str.charAt(0) == '+';
        }

        int result = 0;
        for (; i < str.length(); i++) {
            if(str.charAt(i) < '0' || str.charAt(i) > '9'){
                break;
            }

            int temp = result * 10 + (str.charAt(i) - '0');
            if(temp / 10 != result){
                return flag ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = temp;
        }

        return flag ? result : -result;
    }

}
