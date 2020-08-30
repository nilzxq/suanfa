package leetcode.string;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author nilzxq
 * @Date 2020-08-30 8:49
 */
public class Problem_50_FirstUniqChar {
    public char firstUniqChar(String s){
        //错误 hashmap是无序的
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            //可以优化value为布尔类型
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i),1);
            }
        }
        //这里 hashmap无序，所以按原数组的顺序获取结果
        for(char key:s.toCharArray()){
            if(map.get(key)==1){
                return key;
            }
        }
        return ' ';
    }


}
