package interview.wuba;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author nilzxq
 * @Date 2020-09-14 21:12
 */
public class M3 {
    public static void main(String[] args) {
        int i=(int)2L;
        double d=3.4f;//自动类型提升
        long l=3;//自动类型提升
        float f=(float) 1.1;
    }
    public int firstMissingPositive (int[] nums) {
        // write code here
      Set<Integer> set=new HashSet<Integer>();
      for(int num:nums){
          if(num>0&&!set.contains(num)){
              set.add(num);
          }
      }
      Integer[] pos=new Integer[set.size()];
      set.toArray(pos);
        Arrays.sort(pos);
        for(int i=0;i<pos.length;i++){
            if(i+1!=pos[i]){
                if(i==0){
                    return 1;
                }else{
                    return pos[i-1]+1;
                }
            }
        }
        return pos.length+1;
    }

}
