package leetcode.greedy;

import java.util.Scanner;

/**
 * 贪心
 * 样例：
 * 4
 * 9 8 17 6
 * https://cloud.tencent.com/developer/article/1371697
 * @Author nilzxq
 * @Date 2020-09-12 11:23
 */
public class 均分纸牌 {
    public static void main(String[] args) {
        //数组大小比数据范围稍大
        int[] a=new int[10000+5];
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int ans=0,t=0;//ans表示移动次数，t表示要移动的牌数
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        int avg=sum/n;
        //遍历每个牌堆（到最后一堆牌数一定等于平均值）
        for(int i=0;i<n-1;i++){
            //如果这个牌堆收到移动过来的牌后牌数不等于平均值，就需要移动
            if(a[i]+t!=avg){
                //计算移动的牌数，或正或负
                t=a[i]+t-avg;
                ans++;
            }else{
                //不用移动就是移动0张且次数不变
                t=0;
            }
        }
        System.out.println(ans);
    }
}
