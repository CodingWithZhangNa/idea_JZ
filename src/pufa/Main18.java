package pufa;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main18 {
    /*
    题目：数组中只出现一次的数
    思路：利用set的元素不能重复性
     */
    public static void main(String[] args) {
        //int[] num = {1,2,3,3,4,4,5,5,6,6,7};
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
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
            System.out.println(findAppearanceOne(arr));
        }
    }

    public static Set<Integer> findAppearanceOne(int[] num) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < num.length; i++) {
            if (!set.add(num[i])) {
                set.remove(num[i]);
            }
        }
        return set;
    }
}
