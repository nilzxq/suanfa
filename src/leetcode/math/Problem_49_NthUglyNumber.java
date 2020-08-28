package leetcode.math;

/**
 * @Author nilzxq
 * @Date 2020-08-28 9:24
 */
public class Problem_49_NthUglyNumber {
    public int nthUglyNumber(int n){
        if(n<0){
            return 0;
        }
        int[] arr=new int[n];
        arr[0]=1;
        int p2=0,p3=0,p5=0;
        for(int i=1;i<n;i++){
            int lastMaxUgly=arr[i-1];
            while(lastMaxUgly>=arr[p2]*2){
                p2++;
            }
            while(lastMaxUgly>=arr[p3]*3){
                p3++;
            }
            while(lastMaxUgly>=arr[p5]*5){
                p5++;
            }
            arr[i]=Math.min(Math.min(arr[p2]*2,arr[p3]*3),arr[p5]*5);
        }
        return arr[n-1];
    }

    //判断丑数
    public boolean isUglyNumber(int n){
        while(n%2==0){
            n/=2;
        }
        while(n%3==0){
            n/=3;
        }
        while(n%5==0){
            n/=5;
        }
        return n==1;
    }
}
