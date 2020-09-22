package pufa;

import java.util.HashMap;
import java.util.Map;

public class Main10 {
    /*
    题目：给一个数组，一个target值，求数组中俩元素和为target的俩下标
    思路：通过集合的思想。
     */
    public static void main(String[] args) {
        int[] array = {2,54,7,15};
        int target = 9;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < array.length; i++){
            map.put(array[i],i);
        }

        for(int i = 0; i < array.length; i++){
            int temp = target - array[i];
            if(map.containsKey(temp) && map.get(temp)!= i )
                System.out.println(i+" "+map.get(temp));
                return;
        }
    }
}
