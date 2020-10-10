package leetcode.string;

/**
 * 最长上升子序列
 * 输出最长上升子序列 二分和动规
 * https://www.nowcoder.com/practice/9cf027bf54714ad889d4f30ff0ae5481?tpId=188&&tqId=35633&rp=1&ru=/activity/oj&qru=/ta/job-code-high-week/question-ranking
 * @Author nilzxq
 * @Date 2020-10-10 9:02
 */
public class LIS {
    /**
     * dp存储每个元素往前的最长子数列大小
     * dp[i]=max(dp[i],dp[j]+1) j为0--i-1中比arr[i]小的子数列数据
     * @param arr
     * @return
     */
    public static int[] LIS(int[] arr){
        int n=arr.length;
        //列表的最大子序列，下标从1开始
        int[] end=new int[n+1];
        //存储每个元素的最大序列个数
        int[] dp=new int[n];
        int len=1;
        //子序列的第一个元素默认为数组的第一个元素
        end[1]=arr[0];
        //第一个元素的最大子序列个数肯定是1
        dp[0]=1;
        for(int i=0;i<n;i++){
            if(end[len]<arr[i]){
                //当arr[i]>end[len]时，把arr[i]添加到end后面
                end[++len]=arr[i];
                dp[i]=len;
            }else{
                // 当前元素小于end中的最后一个元素 利用二分法寻找第一个大于arr[i]的元素
                // end[l] 替换为当前元素 dp[]
                int l=0;
                int r=len;
                while(l<=r){
                    int mid=(l+r)>>1;
                    if(end[mid]>=arr[i]){
                        r=mid-1;
                    }else{
                        l=mid+1;
                    }

                }
                end[l]=arr[i];
                dp[i]=l;
            }
        }
        int[] res=new int[len];
        for(int i=n-1;i>=0;i--){
            if(dp[i]==len){
                res[--len]=arr[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr={2,1,5,3,6,4,8,9,7};
        int[] res=LIS(arr);
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }
}
