package leetcode.sort;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Author nilzxq
 * @Date 2020-07-29 17:56
 *
 * https://blog.csdn.net/qq_38262266/article/details/106991736?utm_medium=distribute.pc_relevant.none-task-blog-baidujs-2&spm=1001.2101.3001.4242
 */
public class Heap {
    /*
    add 增加一个元索 如果队列已满，则抛出一个IIIegaISlabEepeplian异常
    remove 移除并返回队列头部的元素 如果队列为空，则抛出一个NoSuchElementException异常
    element 返回队列头部的元素 如果队列为空，则抛出一个NoSuchElementException异常
    offer 添加一个元素并返回true 如果队列已满，则返回false
    poll 移除并返问队列头部的元素 如果队列为空，则返回null
    peek 返回队列头部的元素 如果队列为空，则返回null
 */
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>(new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        for(int i=10;i>=0;i--){
            if(priorityQueue.size()<5){
                priorityQueue.add(i);
            }else{
                priorityQueue.remove();
                priorityQueue.add(i);
            }
        }

        while(!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.remove());
        }

    }

}
