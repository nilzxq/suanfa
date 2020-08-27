package leetcode.dp;

/**
 * 最低票价
 * @Author nilzxq
 * @Date 2020-08-12 14:44
 */
public class Problem_983_MincostTickets {

    public int mincostTickets(int[] days,int[] costs){
        int len=days.length,maxDay=days[len-1],minDay=days[0];
        //防止越界
        int[] dp=new int[maxDay+31];
        // 只需看 maxDay -> minDay，此区间外都不需要出门，不会增加费用
        //「今天买多少，得看后几天怎么安排」，即「前面依赖后面」——从后向前来买。
        for(int d=maxDay,i=len-1;d>=minDay;d--){
            //需要出门的
            if(d==days[i]){
                /**
                 * dp[i] = min(决策1, 决策2, 决策3);
                 *       = min(c[0] + 1天后不包, c[1] + 7天后不包, c[2] + 30天不包);
                 *       = min(c[0] + dp[i + 1], c[1] + dp[i + 7], c[2] + dp[i + 30]);
                 *
                 * 作者：lzhlyle
                 * 链接：https://leetcode-cn.com/problems/minimum-cost-for-tickets/solution/java-dong-tai-gui-hua-si-lu-bu-zou-cong-hou-xiang-/
                 * 来源：力扣（LeetCode）
                 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
                 */
                dp[d]=Math.min(dp[d+1]+costs[0],dp[d+7]+costs[1]);
                dp[d]=Math.min(dp[d],dp[d+30]+costs[2]);
                //递减一天
                i--;
            }else{
                //不需要出门
                dp[d]=dp[d+1];
            }
        }
        //从后往前遍历，返回最前的minDay
        return dp[minDay];
    }
}
