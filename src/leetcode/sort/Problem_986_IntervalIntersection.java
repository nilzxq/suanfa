package leetcode.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author nilzxq
 * @Date 2020-10-05 11:35
 */
public class Problem_986_IntervalIntersection {
    public int[][] intervalIntersection(int[][] A,int[][] B){
        int i=0,j=0;
        List<int[]> res=new ArrayList<>();
        while(i<A.length&&j<B.length){
            int a1=A[i][0],a2=A[i][1];
            int b1=B[j][0],b2=B[j][1];
            //两个区间存在交集
            if(b2>=a1&&a2>=b1){
                res.add(new int[]{Math.max(a1,b1),Math.min(a2,b2)});
            }
            if(b2<a2){
                j++;
            }else{
                i++;
            }
        }

        int[][] ans=new int[res.size()][2];
        for(int k=0;k<res.size();k++){
            ans[k]=res.get(k);
        }
        return ans;
    }
}
