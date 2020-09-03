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
    public int[][] merge(int[][] intervals) {
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
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] > cur[1]) {
                res.add(cur);
                cur = intervals[i];
            } else {
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
}
