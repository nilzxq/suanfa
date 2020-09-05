package leetcode.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @Author nilzxq
 * @Date 2020-09-03 22:06
 */
public class Problem_56_Merge {
    public  static int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
            return intervals;
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        List<int[]> res = new ArrayList<>();
        int[] cur = intervals[0];
//        for(int i=0;i<cur.length;i++){
//            System.out.print(cur[i]+" ");
//        }
//        System.out.println();
        for (int i = 1; i < intervals.length; i++) {
            //下一个的起始大于当前的结束，则直接加入，且cur往前移
            if (intervals[i][0] > cur[1]) {
                res.add(cur);
                cur = intervals[i];
            } else {
                //否则有重合的地方，直接合并
                cur[1] = Math.max(cur[1], intervals[i][1]);
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
        int[][] ans=merge(intervals);
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
        }
    }
}
