package pufa;

import java.util.HashMap;
import java.util.Scanner;

public class Main8 {
    /*
    题目：计算一个字符串中每个字符出现的次数
    思路：使用Scanner获取用户输入的字符串,创建Map集合，key是字符串中的字符，value是字符的个数
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();
        HashMap<Character,Integer> map = new HashMap<>();
        //遍历字符串，获取每一个字符
        for(char c : str.toCharArray()){
            if(map.containsKey(c)){
                Integer value = map.get(c);
                value++;
                map.put(c,value);
            }else{
                map.put(c,1);
            }
        }

        //遍历map集合，输出结果
        /*
        for(Character key : map.keySet()){
            Integer value = map.get(key);
            System.out.println(key+"="+value);
        }
         */
        System.out.println(map);
    }
}
