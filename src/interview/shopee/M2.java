package interview.shopee;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * 找出无序数组的中位数
 * 堆
 * @Author nilzxq
 * @Date 2020-09-16 15:32
 */
public class M2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        if(str==" "||str.length()==0){
            System.out.println(-1);
            return;
        }
        String[] strs=str.split(",");
        int[] num=new int[strs.length];
        for(int i=0;i<strs.length;i++){
            num[i]=Integer.parseInt(strs[i]);
        }
//        ArrayList<Integer> arr=new ArrayList<>();
//        while(sc.hasNextLine()){
//            arr.add(sc.nextInt());
//        }
        System.out.println(helper(num));
    }

    public static int helper(int[]  arr){
        if(arr==null||arr.length<=0){
            return -1;
        }
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        int size=arr.length;
        int heapSize=(size+1)/2;
        for(int i=0;i<heapSize;i++){
            queue.offer(arr[i]);
        }
        for(int j=heapSize;j<size;j++){
            int temp=arr[j];
            if(queue.peek()<temp){
                queue.poll();
                queue.offer(temp);
            }
        }
        if(arr.length%2==1){
            return queue.peek();
        }else{
            return (queue.poll()+queue.peek())/2;
        }
        //return queue.peek();
    }
}
