package newcoder.chapter4;

/**
 * @Author nilzxq
 * @Date 2021-07-06 11:41
 */
public class Problem_01_SubMatrixMaxSum {
    public static int maxSum(int[][] arr) {
        if(arr==null||arr.length==0||arr[0].length==0){
            return 0;
        }
        int cur=0;
        int maxSum=Integer.MIN_VALUE;
        int[] s=null; //累加数组
        for(int i=0;i<arr.length;i++){
             s=new int[arr[0].length];
             for(int j=i;j<arr.length;j++){
                 cur=0;
                 for(int k=0;k<s.length;k++){
                     s[k]+=arr[j][k];
                     cur+=s[k];
                     maxSum=Math.max(cur,maxSum);
                     cur=cur<0?0:cur;
                 }
             }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[][] matrix = { { -90, 48, 78 }, { 64, -40, 64 }, { -81, -7, 66 } };
        System.out.println(maxSum(matrix));

    }
}
