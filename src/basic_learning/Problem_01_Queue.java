package basic_learning;

import java.util.LinkedList;
import java.util.Queue;

/** 
* @author nilzxq
* @version 2020年4月22日 下午8:43:17 
*类说明 
*/
public class Problem_01_Queue {

	/**
	 *  队列是一种特殊的线性表
	 * LinkedList类实现了Queue接口，因此我们可以把LinkedList当成Queue来用
	 * @param args
	 */
	public static void main(String[] args) {
		//add()和remove()方法在失败的时候会抛出异常(不推荐)
		Queue<String> queue=new LinkedList<>();
		//添加元素
		queue.offer("a");
		queue.offer("b");
		queue.offer("c");
		queue.offer("d");
		queue.offer("e");
		for(String q:queue) {
			System.out.println(q);
		}
		System.out.println("===");
		//返回第一个元素，并在队列中删除
		System.out.println("poll="+queue.poll());
		for(String q:queue) {
			System.out.println(q);
		}
		System.out.println("====");
		//返回第一个元素
		System.out.println("element="+queue.element());
		for(String q:queue) {
			System.out.println(q);
		}
		System.out.println("=====");
		//返回第一个元素
		System.out.println("peek="+queue.peek());
		for(String q:queue) {
			System.out.println(q);
		}
	}
}
