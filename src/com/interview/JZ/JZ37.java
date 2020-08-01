package com.interview.JZ;

/*
题目：统计一个数字在排序数组中出现的次数。
思路：第一种解法：暴力法。顺序遍历数组。此方法未利用题目中给的有序条件。
     第二种解法：二分查找。首先找到数组中目标值出现的第一个位置first，然后再找到数组中目标值最后一次出现的位置end，
     end - first + 1就是目标值出现的次数。
 */

public class JZ37 {

    //找出第一次出现的位置
    private int getFirst(int[] nums, int k, int start, int end){
        if(start > end){
            return -1;
        }
        int middleIndex = (start + end) /2;
        int middleData = nums[middleIndex];
        if(middleData == k){
            //找出第一次出现的位置终止条件：要么索引为0；要么索引大于0但是索引-1的位置不等于k
            if((middleIndex > 0 && nums[middleIndex-1]!=k) || middleIndex==0){
                return middleIndex;
            }else{
                end = middleIndex - 1;
            }
        }else if(middleData > k){
            end = middleIndex - 1;
        }else{
            start = middleIndex + 1;
        }
        return getFirst(nums, k, start, end);
    }

    //找出最后一次出现的位置
    private int getLast(int[] nums, int k, int start, int end){
        if(start > end){
            return -1;
        }
        int middleIndex = (start + end) /2;
        int middleData = nums[middleIndex];
        if(middleData == k){
            //找出最糊一次出现的位置终止条件：要么索引为长度减1；要么索引小于长度减1 但是索引+1的位置不等于k
            if((middleIndex < nums.length - 1 && nums[middleIndex+1]!=k) || middleIndex==nums.length - 1){
                return middleIndex;
            }else{
                start = middleIndex + 1;
            }
        }else if(middleData < k){
            start = middleIndex + 1;
        }else{
            end = middleIndex - 1;
        }
        return getLast(nums, k, start, end);
    }

    public int getNumberOfK(int[] nums,int k){
        int number = 0;
        int len = nums.length;
        if(nums != null && len > 0){
            int firstK = getFirst(nums, k, 0, len - 1);
            int lastK = getLast(nums, k, 0, len -1);
            if(firstK > -1 && lastK > -1){
                number = lastK - firstK + 1;
            }
        }
        return number;
    }

    public static void main(String[] args) {
        JZ37 m1 = new JZ37();
        int[] nums = {1,2,3,3,3,3,4,5};
        int count = m1.getNumberOfK(nums, 3);
        System.out.println(count);
    }

}
