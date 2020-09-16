package pufa;

import java.util.HashMap;

public class Main21 {
    /*
    题目：判断两个字符是否是异位（一种重新排列的字母字符串），比如abcn和banc是一对，anc和nac是一对。
    思路：为了确定t到底是不是一个s重排后的字符串，我们可以统计每个字符出现的次数，然后比较他们。
    求解：此题解法适用于输入任何字符的判断，采用了哈希表。
     */
    public static void main(String[] args) {
        System.out.println(equalStr("abcn","bacn"));
        System.out.println(equalStr2("abcn","bacn"));
    }

    public static boolean equalStr(String s, String t){
        if(s.length() != t.length())
            return false;
        HashMap<Character,Integer> map = new HashMap<>();
        for(char i : s.toCharArray()) {
            if (map.get(i) == null) {
                map.put(i, 1);
            }else{
                map.put(i,1+map.get(i));
            }
        }

        for(char j : t.toCharArray()){
            if(!map.containsKey(j) || map.get(j) == 0)
                return false;
            else
                map.put(j,map.get(j) - 1);
        }
        return true;
    }

    public static boolean equalStr2(String s, String t){
        if(s.length() != t.length())
            return false;

        int[] hash = new int[26];
        for(int i = 0; i < s.length(); i++){
            hash[s.charAt(i) - 'a']++;
            hash[t.charAt(i) - 'a']--;
        }
        for(int i : hash){
            if(i != 0)
                return false;
        }
        return true;
    }

}
