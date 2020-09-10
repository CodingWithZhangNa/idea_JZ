package pufa;

public class Main4 {
    /*
    题目：0-7数字，凑成1-8位的奇数，输出每一种多少个
    思路：当只有一位数时也就是该数的最后一位，奇数个数为4
         当该数为两位数时，奇数个数为4*7=28
         当该数为三位数时，奇数个数为4*8*7=224
         ...
         当该数为八位数时，奇数个数为4*8*8*8*8*8*8*7（依次为最后一位到第一位）
     */
    public static void main(String[] args) {
        int sum = 0;
        int total = 0;
        for(int i = 1; i < 9; i++){   //最大位数为8位
            if(i == 1){
                total = 4;
            }
            else if (i == 2){
                total = total * 7;
            } else {
                total = total * 8;
            }
            System.out.println("0~7组成"+i+"位数，有："+total+"个");
            sum += total;
        }
        System.out.println("总计为：" + sum);
    }
}
