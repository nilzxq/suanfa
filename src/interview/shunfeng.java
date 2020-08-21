package interview;

import java.util.*;

/**
 * @Author nilzxq
 * @Date 2020-08-20 20:01
 */

//背包问题变形 动态规划

public class shunfeng {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int m=sc.nextInt();
//        int[] server=new int[n];
//        int[][] client=new int[m][2];
//        for(int i=0;i<n;i++){
//            server[i]=sc.nextInt();
//        }
//        for(int i=0;i<m;i++){
//            for(int j=0;j<2;j++){
//                client[i][0]=sc.nextInt();
//                client[i][1]=sc.nextInt();
//            }
//        }
//        Arrays.sort(server);
        helper();
    }

    /**
     * 小A的购买了一批服务器，他准备将这些服务器租用出去。每一个服务器有一个固定的带宽，人们根据
     * 自己需要的带宽来租用这些服务器。一台服务器只能租给一个人。
     *
     * 小A现在有n个空闲的服务器，第 i 个服务器拥有ai的带宽。有m个客户来租服务器，第 i 位客户需要
     * 带宽至少为bi的服务器，并且愿意花ci元作为预算。（服务器带宽独立不可叠加，若不能成功租出则输出0）
     * 小A可以选择拒绝一些人，现在，小A想知道自己的服务器最多能租多少钱？
     *
     * 输入描述
     * 输入第一行包含两个数n,m
     *
     * 接下来1行n个数，第i个数ai代表第 i 个服务器的带宽大小。
     *
     * 接下来m行，每行两个数bi,ci，代表客户需求的带宽大小和他的预算。
     *
     * n,m≤1000 , 1≤ai,bi,ci≤1000
     *

     *
     * 给定的服务器按带宽升序排列，候选的按照价值降序，遍历拥有的服务器，每一次都挑一个最大价值，
     * （也就是用手头上最小带宽的服务器，去挑一个满足客户需求的最大值），最终把手头上的服务器遍历完后，就得到最大收益了
     *
     * 输出描述
     * 输出一个数，即小A最多能租多少元的服务器出去。
     * @return
     */
    public static void helper(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] server=new int[n];
        for(int i=0;i<n;i++){
            server[i]=sc.nextInt();
        }
        int[][] client=new int[m][2];
        for(int i=0;i<m;i++){
                client[i][0]=sc.nextInt();
                client[i][1]=sc.nextInt();
        }
        Arrays.sort(server);
        Arrays.sort(client,(o1,o2)->{
            if(o1[0]!=o2[0]){
                return o1[0]-o2[0];
            }else{
                return o2[1]-o2[1];
            }
        });
//        Arrays.sort(client, 0, m , new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                if(o1[0]!=o2[0]){
//                    return o1[0]-o2[0];
//                }else{
//                    return o2[1]-o2[1];
//                }
//
//            }
//        });
        int res=0;
        boolean[] arr=new boolean[client.length];
        for(int i=0;i<n;i++){
            int tmp=0;
            int bi=-1;
            for(int j=0;j<client.length;j++){
                if(!arr[j]&&client[j][0]<=server[i]){
                    if(client[j][1]>tmp){
                        bi=j;
                        tmp=client[j][1];
                    }
                }
            }
            if(bi>=0){
                arr[bi]=true;
            }
            res+=tmp;
        }
        System.out.println(res);
//        HashMap<Integer,Integer> map=new HashMap<>();
//
//        for(int i=0;i<m;i++){
//            int j=0;
//            int temp=client[i][0];
//            if(temp<=server[j]){
//               if(map.containsKey(temp)) {
//                   if (map.get(temp) < client[i][1]) {
//                       sum = sum - map.get(temp) + client[i][1];
//                       map.remove(temp);
//                       map.put(temp, client[i][1]);
//                   }
//               }
//               j++;
//            }
//        }
//        System.out.println(sum);
    }

//    public class Client{
//        int bandwith;
//        int value;
//    }

    /**
     * 克里森是一名赏金猎人，他平时需要完成一些任务赚钱。最近他收到了一批任务，但是受到时间的限制，他只能完成其中一部分。
     * 具体来说就是有n个任务，每个任务用l, r, w来表示任务开始的时间l，结束的时间r和完成任务获得的金钱。
     *
     * 克里森是个贪心的人，他想知道自己在任务不冲突的情况下最多获得多少金钱。
     * @return
     *
     * 课程题的变形
     *
     * 第一行一个数n表示任务的个数。(1≤n≤1e3)
     *
     * 接下来n行每行三个整数l, r, w表示第i个任务的开始时间，
     * 结束时间，以及收益。(1≤l≤r≤1e6,1≤w≤1e9)
     */

    public class Task implements Comparable<Task>{
        long start;
        long end;
        long value;

        public Task(long start, long end, long value) {
            this.start = start;
            this.end = end;
            this.value = value;
        }

        @Override
        public int compareTo(Task t) {
            if(start==t.start){
                return (int)(end-t.end);
            }else{
                return (int)(start-t.start);
            }

        }
    }

    /**
     * 只能完成一部分任务 金钱最大
     * @return
     */
    public void helper2(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Task[] task=new Task[n];
        for(int i=0;i<n;i++){
//            task[i].start=sc.nextInt();
//            task[i].end=sc.nextInt();
//            task[i].value=sc.nextInt();
            long s=sc.nextLong();
            long e=sc.nextLong();
            long v=sc.nextLong();
            task[i]=new Task(s,e,v);
        }
        Arrays.sort(task);
        long[] dp=new long[n];
        dp[0]=task[0].value;
        for(int i=0;i<n;i++){
            Task t=task[i];
            long max=t.value;
            for(int j = 0; j < i; j++) {
                if(task[j].end <= t.start) {
                    max = Math.max(dp[j]+t.value,max);
                }
            }
            dp[i]=max;
        }

        long max = 0;
        //System.out.println(Arrays.toString(dp));
        for(int i = 0; i < n; i++) {
            max = Math.max(dp[i],max);
        }
        System.out.println(max);
    }

    class MyCompactor implements Comparator<Task>{

        @Override
        public int compare(Task o1, Task o2) {
            if(o1.start>o2.start){
                return 1;
            }
            else {
                return -1;
            }
        }
    }
}
