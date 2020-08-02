package interview;

import java.util.Scanner;

/**
 * @Author nilzxq
 * @Date 2020-08-02 20:55
 */
public class pinduoduo1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int K = in.nextInt();
        int N = in.nextInt();
        int[] arr=new int[N];
        int sum=0;
        for(int i=0;i<N;i++){
            arr[i]=in.nextInt();
            sum+=arr[i];
        }
//        if(sum%K==0){
////            System.out.println("paradox");
////            return;
////        }
////        int[] res=helper(arr,K);
////        System.out.println(res[0]+" "+res[1]);
        helper1(arr,K,sum);
    }

    public static int[] helper(int[] nums,int K){
        int sum=0;
        int[] res=new int[2];
        for(int i=0;i<nums.length;i++){
            K-=nums[i];
                if(K>0&&i==nums.length){
                    res[0]=K;
                    res[1]=0;
                    return res;
                }


        }
        return res;
    }

    /**
     * 10 4
     * 6 3 3 3
     * @param nums
     * @param k
     */

    public static void helper1(int[] nums,int k,int sum){
        int cur=k;
        int back=0;
        for(int i=0;i<nums.length;i++){
            cur-=nums[i];
            if(cur==0){
                break;
            }else if(cur<0){
                cur*=-1;
                back+=1;
            }
        }
        if((k==0||cur==0&&sum/k>1)){
            System.out.println("paradox");
        }else{
            System.out.println(cur+" "+back);
        }

    }

}
