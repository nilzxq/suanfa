package leetcode.sort;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author nilzxq
 * @Date 2020-10-05 10:48
 */
public class Problem_1288_RemoveCoveredIntervals {

    public static int removeCoveredIntervals(int[][] intervals){
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0]==o2[0]){
                    return o2[1]-o1[1];
                }
                return o1[0]-o2[0];
            }
        });
        //记录合并区间的起点和终点
        int left=intervals[0][0];
        int right=intervals[0][1];
        int res=0;
        for(int i=1;i<intervals.length;i++){
            //情况1，找到覆盖区间
            if(left<=intervals[i][0]&&right>=intervals[i][1]){
                res++;
            }
            //情况2，找到相交区间，合并
            if(right>=intervals[i][0]&&right<=intervals[i][1]){
                right=intervals[i][1];
            }
            //情况3，完全不相交，更新起点和终点
            if(right<intervals[i][0]){
                left=intervals[i][0];
                right=intervals[i][1];
            }
        }
        return intervals.length-res;
    }

    public static void main(String[] args) {
        int[][] intervals={{1,4},{3,6},{2,8}};
        System.out.println(removeCoveredIntervals(intervals));
    }
}
