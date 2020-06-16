package leetcode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author nilzxq
 * @Date 2020-06-16 22:52
 *
作者：zackqf
链接：https://leetcode-cn.com/problems/dui-lie-de-zui-da-zhi-lcof/solution/javadui-lie-yu-shuang-duan-dui-lie-by-zackqf/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class MaxQueue {
    Queue<Integer> que;
    Deque<Integer> deq;

    public MaxQueue() {
        que = new LinkedList<>();  //队列：插入和删除
        deq = new LinkedList<>();  //双端队列：获取最大值
    }

    public int max_value() {
        return deq.size()>0?deq.peek():-1;  //双端队列的队首为que的最大值
    }

    public void push_back(int value) {
        que.offer(value);  //value入队
        while(deq.size()>0 && deq.peekLast()<value){
            deq.pollLast();  //将deq队尾小于value的元素删掉
        }
        deq.offerLast(value);  //将value放在deq队尾
    }

    public int pop_front() {
        int tmp = que.size()>0?que.poll():-1;  //获得队首元素
        if(deq.size()>0 && deq.peek().equals(tmp)){
            deq.poll();  //如果出队的元素是当前最大值，将deq的队首出队
        }
        return tmp;
    }


    public static void main(String[] args) {
        MaxQueue obj = new MaxQueue();
        obj.push_back(1);
        int param_1 = obj.max_value();
        obj.push_back(3);
        int param_3 = obj.pop_front();
        System.out.println(param_3);
    }
}
