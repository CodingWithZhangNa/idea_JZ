package pufa;

import java.util.Arrays;

public class Main22 {
    /*
    题目：给一个8元素数组例如 1 3 0 3 6 0 0 9 将所有0放后面，其它数字顺序不变，结果为1 3 3 6 9 0 0 0
    要求：只能对原数组进行操作，尽量减少操作次数
    思路：定义两个指针slow和fast指向数组起始位置，如果fast指针指向不为0，把fast指针指向的元素赋值给slow指针，
    然后slow和fast指针加加，如果fast指针指向元素为0，则fast指针加加，一直找到fast指针不为0的位置，再把fast
    指向的元素赋值给slow，最后从slow结束的位置开始填充0至数组的长度。
     */

    public static void main(String[] args) {
        int[] num = {1,2,0,3,0,5,6,3,0,9};
        moveZeros(num);
        System.out.println(Arrays.toString(num));
    }

    public static int[] moveZeros(int[] num) {
        int slow = 0;
        int fast = 0;
        while (fast < num.length) {
            if (num[fast] != 0) {
                num[slow] = num[fast];
                slow++;
                fast++;
            } else {
                fast++;
            }
        }
        for(int i = slow; i < num.length; i++){
            num[i] = 0;
        }
        return num;
    }
}
