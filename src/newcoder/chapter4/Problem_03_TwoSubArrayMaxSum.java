package newcoder.chapter4;

/**
 * @Author nilzxq
 * @Date 2021-07-06 16:37
 */
public class Problem_03_TwoSubArrayMaxSum {
    public static int twoSubArrayMaxSum(int[] arr) {
        if(arr==null||arr.length<2){
            return 0;
        }
        int[] rArray=new int[arr.length];
        int cur=0;
        int max=Integer.MIN_VALUE;
        for(int i=arr.length-1;i>0;i--){
            cur+=arr[i];
            max=Math.max(cur,max);
            rArray[i]=max;
            cur=cur<0?0:cur;
        }
        int res=Integer.MIN_VALUE;
        max=Integer.MIN_VALUE;
        cur=0;
        for(int i=0;i<arr.length-1;i++){
            cur+=arr[i];
            max=Math.max(max,cur);
            res=Math.max(res,rArray[i+1]+max);
            cur=cur<0?0:cur;
        }
        return res;
    }

    //for test
    public static int rightAnswer(int[] arr){
        if(arr==null||arr.length<2){
            return 0;
        }
        int res=Integer.MIN_VALUE;
        for(int i=0;i<arr.length-1;i++){
            res=Math.max(res,maxSum(arr,0,i)+maxSum(arr,i+1,arr.length-1));
        }
        return res;
    }

    //for test
    public static int maxSum(int[] arr,int l,int r){
        int max=Integer.MIN_VALUE;
        int cur=0;
        for(int i=l;i<=r;i++){
            cur+=arr[i];
            max=Math.max(max,cur);
            cur=cur<0?0:cur;
        }
        return max;
    }

//    Math.random()是令系统随机选取大于等于 0.0 且小于 1.0 的伪随机 double 值
//
//    公式：Math.random()*(n-m)+m，生成大于等于m小于n的随机数；
//
//    例如：定义一个随机1到5(取不到5)的变量 [1,5)
//
//    int number=(int)(Math.random()*(5-1)+1)；
//    int number = (int)(Math.random()*4+1)；取值正好是[1,5)

    public static int[] generateRandomArray(){
        int[] res=new int[(int)Math.random()*10+1];
        for(int i=0;i<res.length;i++){
            res[i]=(int)(Math.random()*20)-10;
        }
        return res;
    }

    public static void main(String[] args) {
        int testTime = 5000000;
        boolean hasErr = false;
        for (int i = 0; i < testTime; i++) {
            int[] test = generateRandomArray();
            if (twoSubArrayMaxSum(test) != rightAnswer(test)) {
                hasErr = true;
            }
        }
        if (hasErr) {
            System.out.println("23333333");
        } else {
            System.out.println("66666666");
        }

    }
}
