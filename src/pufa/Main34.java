package pufa;

public class Main34 {
    /*
    题目：二分查找
    思路：前提是数组必须有序，若无序，那么按顺序查找
     */

    public static void main(String[] args) {
        int[] array = {10,2,3,4,67,3};
        int index = getIndexByEle(array,3);
        System.out.println("该元素出现的索引是："+index);
    }

    public static int getIndexByEle(int[] array, int ele){
        int minIndex = 0;
        int maxIndex = array.length - 1;
        int centerIndex = (minIndex + maxIndex) / 2;

        while(minIndex <= maxIndex){
            if(ele == array[centerIndex]){
                return centerIndex;
            }else if(ele < centerIndex){
                maxIndex = centerIndex - 1;
            }else if(ele > centerIndex){
                minIndex = centerIndex + 1;
            }
            centerIndex = (minIndex+maxIndex)/2;
        }
        return -1;
    }
}
