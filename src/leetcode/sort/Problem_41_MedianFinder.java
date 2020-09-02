package leetcode.sort;

import java.util.PriorityQueue;

/**
 * @Author nilzxq
 * @Date 2020-09-02 20:25
 */
public class Problem_41_MedianFinder {
    PriorityQueue<Integer> MinHeap,MaxHeap;
    PriorityQueue<Integer> A=new PriorityQueue<>();
    PriorityQueue<Integer> B=new PriorityQueue<>(((o1, o2) -> (o2-o1)));
    int count=0;
    public Problem_41_MedianFinder(){
        //小顶堆，保存较大的一半
        MinHeap=new PriorityQueue<>();
        //大顶堆，保存较小的一半
        MaxHeap=new PriorityQueue<>((o1, o2) -> (o2-o1));

    }

    public void addNum(int num){
    if(MinHeap.size()!=MaxHeap.size()){
        MinHeap.add(num);
        MaxHeap.add(MinHeap.poll());
    }else{
        MaxHeap.add(num);
        MinHeap.add(MaxHeap.poll());
    }
    }

    public double findMedian(){
        return MinHeap.size()!=MaxHeap.size()?MinHeap.peek():(MinHeap.peek()+MaxHeap.peek())/2.0;
    }

    public void insert(int num){
        //[偶数 小顶堆]【也可以大顶堆，只是为了保证一个个轮着来】
        if(count%2==0){
            //如果插入到小顶堆的数字比大顶堆的堆顶元素小，那应该往大顶堆上插
            if(!B.isEmpty()&&B.peek()>num){
                int oldMax=B.poll();
                B.add(num);
                num=oldMax;
            }
            A.add(num);
            //【奇数大顶堆】
        }else{
            //如果插入到大顶堆的数字比小顶堆的堆顶元素大，那应该往小顶堆上插
            if(!A.isEmpty()&&A.peek()<num){
                int oldMin=A.poll();
                A.add(num);
                num=oldMin;
            }
            B.add(num);
        }
        count++;
    }

    public double getMedian(){
        //统计数据大小
        int size=A.size()+B.size();
        if(size==0){
            return 0.0;
        }
        //如果数据为偶数
        if((size&1)==0){
            return (A.peek()+B.peek())/2.0;
        }else{
            //奇数
            return Double.valueOf(A.peek());
        }
    }
}
