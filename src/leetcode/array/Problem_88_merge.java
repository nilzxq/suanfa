package leetcode.array;

/**
 * @Author nilzxq
 * @Date 2020-09-21 12:02
 */
public class Problem_88_merge {
    public void merge(int[] nums1,int m,int[] nums2,int n){
        int len1=m-1,len2=n-1,p=m+n-1;
        while((len1>=0)&&(len2>=0)){
            nums1[p--]=nums1[len1]<nums2[len2]?nums2[len2--]:nums1[len1--];
        }
        // 表示将nums2数组从下标0位置开始，拷贝到nums1数组中，从下标0位置开始，长度为len2+1(下标加1是长度值)
        System.arraycopy(nums2,0,nums1,0,len2+1);
    }
}
