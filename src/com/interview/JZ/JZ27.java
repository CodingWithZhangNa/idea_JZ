package com.interview.JZ;

import java.util.ArrayList;
import java.util.Collections;

public class JZ27 {
    /*
    思路：
    对于无重复的情况：固定第一个字符，递归取得首位后面的各种字符串组合；
    再把第一个字符与后面每一个字符交换，并同样递归获得首位后面的字符串组合；
    递归的出口：就是只剩下一个字符；
    递归的循环过程，就是从每个子串的第二个字符开始依次与第一个字符交换，然后继续处理字串。

    假如有重复值呢？
    对abb，第一个数a与第二个数b交换得bab，然后考虑第一个数与第三个数交换，此时由于第三个数等于第二个数，
    所以第一个数就不用再与第三个数交换了。再考虑bab,它的第二个数与第三个数交换可以解决bba。此时全排列生成完毕！
     */
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> ret = new ArrayList<>();

        if (str == null || str.isEmpty())
            return ret;

        char[] arr = str.toCharArray();

        Permutation(arr,0,ret);

        Collections.sort(ret);
        return ret;
    }

    private void Permutation(char[] arr, int begin, ArrayList<String> cache){
        if(begin == arr.length - 1){
            cache.add(new String(arr));
            return;
        }

        int len = arr.length;
        for(int i = begin; i < len; i++){
            //与begin不同位置的元素相等，不需要交换
            if(i != begin && arr[i] == arr[begin]){
                continue;
            }
            //交换元素
            swap(arr,begin,i);
            //处理后续元素
            Permutation(arr,begin+1,cache);
            //数组复原
            swap(arr,begin,i);
        }
    }

    private void swap(char[] arr, int i, int j){
        if(i == j){
            return;
        }
        arr[i] = (char)(arr[i]^arr[j]);
        arr[j] = (char)(arr[i]^arr[j]);
        arr[i] = (char)(arr[i]^arr[j]);
    }

    public static void main(String[] args) {
        System.out.println(new JZ27().Permutation("abc"));
    }
}
