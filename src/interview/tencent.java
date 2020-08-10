package interview;

/**
 * @Author nilzxq
 * @Date 2020-08-08 11:09
 */
public class tencent {
    /**
     * 最大和
     * @param arr
     * @return
     */
    public static int solution(int[] arr){
        int sum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sumtmp=0;
                for(int k=i;k<=j;k++){
                    sumtmp+=arr[k];
                   // System.out.print(sumtmp+" ");
                }
                if(sumtmp>sum){
                    sum=sumtmp;
                }
            }

        }
        return sum;
    }

    public static int solution2(int[] arr){
        int res=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i]+=Math.max(arr[i-1],0);
            res=Math.max(res,arr[i]);
        }
        return res;
    }

    /**
     * 二次幂
     */
    public static boolean solution1(int n){
        if((n&(n-1))==0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        int[] arr={-1,-2};
//        System.out.println(solution(arr));
//        System.out.println(solution1(3));
        //System.out.println(solution2(arr));
        System.out.println(solution(arr));
    }
}
