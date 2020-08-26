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
        for(int d=maxDay,i=len-1;d>=minDay;d--){
            if(d==days[i]){
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
