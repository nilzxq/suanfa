package leetcode.array;

/**
 * 查找数组中倒数第二小的数
 * @Author nilzxq
 * @Date 2020-09-21 13:11
 */
public class FindSecondLastSmallNum {
    private static int[] arr={3,9,4,5,6,8,7};

    public static void main(String[] args) {
        System.out.println(find1(arr));
        System.out.println(find2(arr));
    }

    /**
     * 定义一个长度为2的数组，用来存放两个最小的数字
     * @param arr
     * @return
     */
    public static int find1(int[] arr){
        int[] minNum=new int[2];
        minNum[0]=Integer.MAX_VALUE;
        minNum[1]=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<minNum[0]){
                minNum[1]=minNum[0];
                minNum[0]=arr[i];
            }else if(arr[i]<minNum[1]){
                minNum[1]=arr[i];
            }
        }
        return minNum[1];
    }

    /**
     * 初始化2个最小值:min1、min2。min1代表最小的数，min2代表倒数第二小的数
     * 遍历所有元素,如果当前元素小于min1,那么将更新min1、min2。
     * 如果大于min1小于min2只更新min2即可。
     */
    public static int find2(int[] arr){
        int min1;
        int min2;
        if(arr[0]>=arr[1]){
            min1=arr[1];
            min2=arr[0];
        }else{
            min1=arr[0];
            min2=arr[1];
        }
        for(int i=2;i<arr.length;i++){
            if(arr[i]<min1){
                min2=min1;
                min1=arr[i];
            }else if(arr[i]<min2){
                min2=arr[i];
            }
        }
        return min2;
    }
}
