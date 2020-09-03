package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @Author nilzxq
 * @Date 2020-09-03 19:45
 */
public class Baidu {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int sum=0;
//        int sum1=0;
//        int temp=0;
//        int flag=-1;
//        int[] arr=new int[n];
//        //各个位数之和
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//            sum+=arr[i];
//            if(arr[i]==0){
//                sum1++;
//            }
//            if(sum%9==0){
//                flag=sum;
//            }
//        }
//        if(flag>0&&sum1>0){
//            int k=flag/5;
//            for(int i=0;i<k;i++){
//                System.out.print("5");
//            }
//            for(int i=0;i<sum1;i++){
//                System.out.print("0");
//            }
//            System.out.println();
//        }else if(sum1>0){
//            System.out.println("0");
//        }else{
//            System.out.println("-1");
//        }
//    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        int count=0;
        ArrayList<Integer> arr=new ArrayList<>();
        while (num!=0) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int n = in.nextInt();
            int m = in.nextInt();
            HashSet<Integer> set=new HashSet<>();
            for(int i=0;i<m;i++){
                int t=in.nextInt();
                for(int j=0;j<t;j++){
                    int a=in.nextInt();
                    int b=in.nextInt();
                    if(set.contains(a)){
                        count++;
                        arr.add(a);
                    }
                    if(set.contains(b)){
                        count++;
                        arr.add(b);
                    }
                    set.add(a);
                    set.add(b);
                    int temp=b-a;
                    while(temp>1){
                        a+=1;
                        if(set.contains(a)){
                            count++;
                            arr.add(a);
                        }
                        set.add(a);
                        temp-=1;
                    }
                }
            }
            num--;
        }
        System.out.println(count);
        int[] res=new int[count];
        for(int i=0;i<count;i++){
            res[i]=arr.get(i);
        }
        Arrays.sort(res);
        for(int i=0;i<count-1;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println(res[count-1]);
    }

    //台阶变形问题
//    public void helper3(int n,int m){
//        if(m>n){
//            return;
//        }
//        helper3(n,m+1);
//        helper3(n,m+2);
//    }
}
