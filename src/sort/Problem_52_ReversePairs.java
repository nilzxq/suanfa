package sort;

import java.util.Arrays;

/**
 * 错误==》待更改
 * @Author nilzxq
 * @Date 2020-09-10 17:00
 */
public class Problem_52_ReversePairs {
    //合并操作
    int count;
    public int reversePairs(int[] nums){
        if(nums==null||nums.length==0){
            return 0;
        }
        count=0;
        sort(nums);
        return count;
    }

    public int[] sort(int[] nums){
        if(nums.length==1){
            return nums;
        }
        int mid=nums.length/2;
        int[] leftNums=sort(Arrays.copyOfRange(nums,0,mid));
        int[] rightNums=sort(Arrays.copyOfRange(nums,mid,nums.length));
        return merge(leftNums,rightNums);
    }

    public int[] merge(int[] leftNums,int[] rightNums){
        int[] res=new int[leftNums.length+rightNums.length];
        int i=0,j=0,p=0;
        while(i<leftNums.length&&j<rightNums.length){
            if(leftNums[i]<rightNums[j]){
                res[p]=leftNums[i];
                i++;
            }else{
                res[p]=rightNums[j];
                //统计的代码
                //[3] 4 5  [1] 2 4
                //[3] [1]
                count+=(leftNums.length-i);
                count%=1000000007;
                j++;
            }
            p++;
        }
        while(i<leftNums.length){
            res[p++]=leftNums[i++];
        }
        while(j<rightNums.length){
            res[p++]=rightNums[j++];
        }
        return res;
    }
}
