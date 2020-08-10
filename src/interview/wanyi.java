package interview;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/**
 * @Author nilzxq
 * @Date 2020-08-08 15:04
 */
public class wanyi {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
//            int num=in.nextInt();
//            int[] a=new int[num];
//            for(int i=0;i<num;i++){
//                a[i]=in.nextInt();
//            }
//            System.out.println(helper(a));
            /**
             * 素数 /2的妙用
             */
            long n,num,res=0;
            n=in.nextLong();
            for(int i=0;i<n;i++){
                num=in.nextLong();
                res+=(num/2);
            }
            System.out.println(res);
        }
        //拆分数组最多的素数个数
    //拆分成2和3最多
        public static int helper(int[] arr){
            int sum=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]==2||arr[i]==3){
                    sum+=1;
                    continue;
                }
                int sumtemp=0;
                for(int j=0;j<=arr[i]/2;j++){
                    for(int k=0;k<=arr[i]/3;k++){
                        if(arr[i]==j*2+k*3){
                            if((j+k)>sumtemp){
                                sumtemp=j+k;
                            }
                        }

                    }
                }
                sum+=sumtemp;
            }
            return sum;
        }


        //1.什么是字典序
    //2.字典序最小的排列

    /**
     * 5 3
     * 2 1 5
     * 2 1 3 4 5
     *
     * 5 2
     * 4 2
     * 1 3 4 2 5
     * @param n
     * @param m
     * @param arr
     * @return
     */
    public static int[] helper2(int n,int m,int[] arr){
        Arrays.sort(arr);
        if(arr[m-1]==n){

        }
        return new int[0];
    }

    /**
     * 1
     * 5
     * 30 60 5 15 30
     * 贪心
     * @param arr
     * @param length
     * @return
     */
    public static int helper3(int[] arr,int length){
        Arrays.sort(arr);
        int sum=0;
        for(int i=0;i<length;i++){
            sum+=arr[i];
            if(arr[length-i]==sum-arr[length-i]){
                return 0;
            }
        }
        return 0;
    }

    public static boolean canFinish(int num){
        return new Random().nextBoolean();
    }

}
