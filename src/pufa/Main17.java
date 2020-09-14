package pufa;

public class Main17 {
    /*
    题目：输入一个整数，求其二进制1的个数
    思路：调用Integer方法，将i的二进制转为字符串，再依次遍历其中1的个数
     */
    public static void main(String[] args) {
        System.out.println(getNum1(2));
    }

    public static int getNum1(int num){
        int count = 0;
        String str = Integer.toBinaryString(num);
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '1')
                count++;
        }
        return count;
    }
}
