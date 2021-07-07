package newcoder.chapter5;


import java.util.LinkedList;

/**
 * @Author nilzxq
 * @Date 2021-07-07 11:43

 *  给定数组arr和整数num， 共返回有多少个子数组满足如下情况：
 *  max(arr[i..j]) - min(arr[i..j]) <= num
 *  max(arr[i..j])表示子数组arr[i..j]中的最大值， min(arr[i..j])表示子数组arr[i.中的最小值。
 *  【要求】
 *  如果数组长度为N， 请实现时间复杂度为O(N)的解法。
 *
 *
 *  从当前位置 i 开始 采用双重循环， j 向后面开始扩充，采用两个队列，分别记录当前 i - j 的最大值和最小值
 *  当 arrays[maxList.peekLast()] - arrays[minList.peekLast()] > num 时不满足题意，
 *  则 j 停止扩充，然后计算从 i 到 j 共有多少个子数组  j - i 记录，
 *  并且判断当前位置 i 是否还在最大或最小队列中，如果存在，则弹出，因为 i 马上要过期了
 *  然后 i++ 继续扩充
 *
 */
public class Problem_02_AllLessNumSubArray {
    public static int getNum(int[] arr,int num){
       if(arr==null||arr.length==0){
           return 0;
       }

    LinkedList<Integer> qmin=new LinkedList<>();
    LinkedList<Integer> qmax=new LinkedList<>();
    int i=0;
    int j=0;
    int res=0;
    while(i<arr.length){
       while(j<arr.length){
           while(!qmin.isEmpty()&&arr[qmin.peekLast()]>=arr[j]){
               qmin.pollLast();
           }
           qmin.addLast(j);
           while(!qmax.isEmpty()&&arr[qmax.peekLast()]<=arr[j]){
               qmax.pollLast();
           }
           qmax.addLast(j);
           if(arr[qmax.getFirst()]-arr[qmin.getFirst()]>num){
               break;
           }
           //!!!!
           j++;
       }
       //判断当前位置 i 是否还在最大或最小队列中，如果存在，则弹出，因为 i 马上要过期了
        // 然后 i++ 继续扩充
       if(qmin.peekFirst()==i){
           qmin.pollFirst();
       }
       if(qmax.peekFirst()==i){
           qmax.pollFirst();
       }
        //!!!!
       res+=j-i;
       i++;
    }
        return res;
    }

    // for test
    public static int[] getRandomArray(int len) {
        if (len < 0) {
            return null;
        }
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        return arr;
    }

    // for test
    public static void printArray(int[] arr) {
        if (arr != null) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr = getRandomArray(30);
        int num = 5;
        printArray(arr);
        System.out.println(getNum(arr, num));

    }
}
