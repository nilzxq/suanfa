package interview.jianxin;

import java.util.Arrays;

/**
 * @Author nilzxq
 * @Date 2020-10-10 19:49
 */
public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param cars int整型一维数组 车辆数量
     * @param num int整型 出游总人数
     * @return int整型
     */
    int res=Integer.MAX_VALUE;
    public int carsTrans (int[] cars, int num) {
        // write code here
        if(cars.length==0){
            return -1;
        }
        helper(cars,num,0);
        if(res==Integer.MAX_VALUE){
            return -1;
        }
        return res;
    }

    public void helper(int[] cars,int num,int count){
        if(num<0){
            return;
        }
        if(num==0){
            res=Math.min(res,count);
        }
        for(int i=0;i<cars.length;i++){
            helper(cars,num-cars[i],count+1);
        }
    }
}
