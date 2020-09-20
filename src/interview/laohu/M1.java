package interview.laohu;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @Author nilzxq
 * @Date 2020-09-20 17:06
 */
public class M1 {
    static class Task{
        int profit;
        int cost;

        public Task(int profit, int cost) {
            this.profit = profit;
            this.cost = cost;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int w=sc.nextInt();
        int k=sc.nextInt();
        sc.nextLine();
        int[] costs=new int[n];
        for(int i=0;i<n;i++){
            costs[i]=sc.nextInt();
        }
        sc.nextLine();
        int[] profits=new int[n];
        for(int i=0;i<n;i++){
            profits[i]=sc.nextInt();
        }
        System.out.println(helper(k,w,costs,profits));
       // System.out.println(helper(3,50,new int[]{10,20,100},new int[]{11,10,200}));
    }

    public static long helper(int k,int w,int[] costs,int[] profits){
        long res=w;
        PriorityQueue<Task> min=new PriorityQueue<>(new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                return o1.cost-o2.cost;
            }
        });

        PriorityQueue<Task> max=new PriorityQueue<>(new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                return o2.profit-o1.profit;
            }
        });
        Task cur;
        for(int i=0;i<costs.length;i++){
            cur=new Task(profits[i],costs[i]);
            min.add(cur);
        }
        for(int i=0;i<k;i++){
            while(!min.isEmpty()&&min.peek().cost<=w){
                max.add(min.poll());
            }
            if(max.isEmpty()){
                return w;
            }
            res+=max.poll().profit;
            w+=max.poll().profit;
        }
        return res;
    }


}
