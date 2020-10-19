package pufa;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main19 {
    /*
    题目：一个整型数组除了两个数字之外，其他的数字都出现了两次，请写程序找出这两个只出现一次的数字
    思路：和Main18比较像
     */
    public static void main(String[] args) {
        //int[] nums = {1,2,3,3,4,4,5,5,6,6};
        Scanner in = new Scanner(System.in);
        //while (in.hasNext()) {
        String str = in.nextLine();
        StringBuilder s = new StringBuilder();
        for (int i = 1; i < str.length() - 1; i++) {
            s.append(str.charAt(i));
        }
        str = s.toString();
        String[] array = str.split(",");
        int[] arr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i] = Integer.parseInt(array[i]);
        }
        int[] num1 = new int[1];
        int[] num2 = new int[1];
        findAppearanceOnce(arr, num1, num2);
        System.out.println("第一个数字: " + num1[0]);
        System.out.println("第二个数字: " + num2[0]);
        //}
    }

    public static void findAppearanceOnce(int[] nums, int[] num1, int[] num2) {
        //利用set的元素不能重复性
        //num1，num2分别为长度为1的数组，传出参数
        int flag = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) {
                set.remove(nums[i]);
            }
        }

        //set转化为两个数组
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            if (flag == 0) {
                num1[0] = it.next();
                flag = 1;
            } else {
                num2[0] = it.next();
            }
        }
    }

}
