package leetcode.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 合并区间
 * @Author nilzxq
 * @Date 2020-10-05 11:17
 */
public class Problem_56_Merge_1 {
    public static int[][] merge(int[][] intervals){
        if(intervals.length==0){
            return intervals;
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        List<int[]> list=new ArrayList<>();
        int left=intervals[0][0];
        int right=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]>right){
                list.add(new int[]{left,right});
                left=intervals[i][0];
                right=intervals[i][1];
            }else{
                right=Math.max(right,intervals[i][1]);
            }
        }
        list.add(new int[]{left,right});
        int[][] ans=new int[list.size()][2];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }

    public static int[][] merge2(int[][] intervals){
        if(intervals.length==0){
            return intervals;
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        List<int[]> res=new ArrayList<>();
        int[] cur=intervals[0];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]>cur[1]){
                res.add(cur);
                cur=intervals[i];
            }else{
                cur[1]=Math.max(cur[1],intervals[i][1]);
            }
        }
        res.add(cur);
        int[][] ans=new int[res.size()][2];
        for(int i=0;i<res.size();i++){
            ans[i]=res.get(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] intervals={{1,3},{2,6},{8,10},{15,18}};
        int[][] res=merge(intervals);
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[0].length;j++){
                System.out.println(res[i][j]);
            }
        }
    }
}
