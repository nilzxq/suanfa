package leetcode;

/**
 * @Author nilzxq
 * @Date 2020-06-13 9:37
 */
public class Problem_Sort_InsertionSort {

    /**
     * 直接插入排序
     * @param nums
     */
    public void insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int insertNum = nums[i];
            int insertIndex;
            for (insertIndex = i - 1; insertIndex >= 0 && nums[insertIndex] > insertNum; insertIndex--) {
                nums[insertIndex + 1] = nums[insertIndex];
            }
            nums[insertIndex + 1] = insertNum;
        }
    }

    public static void main(String[] args) {
        Problem_Sort_InsertionSort sort=new Problem_Sort_InsertionSort();
        int[] nums={1,2,0,8,9,7,3};
        sort.insertionSort(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }

    }
}
