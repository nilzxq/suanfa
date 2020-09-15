package leetcode.set;

import java.util.HashSet;

/**
 * @Author nilzxq
 * @Date 2020-09-15 17:05
 */
public class Problem_1496_IsPathCrossing {
    public boolean isPathCrossing(String path){
        HashSet<String> set=new HashSet<>();
        int x=0,y=0;
        set.add(x+" "+y);
        char[] cha=path.toCharArray();
        for(char c:cha){
            switch (c){
                case 'N':y++;break;
                case 'S':y--;break;
                case 'W':x++;break;
                case 'E':x--;break;
            }
            if(set.contains(x+" "+y)){
                return true;
            }
            set.add(x+" "+y);
        }
        return false;
    }
}
