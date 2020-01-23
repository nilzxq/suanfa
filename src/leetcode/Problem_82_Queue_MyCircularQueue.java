package leetcode;
/** 
* @author nilzxq
* @version 2020年1月22日 上午10:47:07 
*类说明 
*/
public class Problem_82_Queue_MyCircularQueue {

		int[] queue;
		int count,front,rear;
		public Problem_82_Queue_MyCircularQueue(int k) {
			queue=new int[k];
		}
		
		public boolean enQueue(int value) {
			if(isFull()) {
				return false;
			}
			queue[rear] = value;
	        rear = (rear + 1) % queue.length;
	        count++;
	        return true;
		}
		
		public boolean deQueue() {
			if (isEmpty())
	            return false;
	        front = (front + 1) % queue.length;
	        count--;
	        return true;
		}
		
		public int Front() {
			if(isEmpty()) {
				return -1;
			}
			return queue[front];
		}
		
		public int Rear() {
			if(isEmpty()) {
				return -1;
			}
			return rear==0?queue[queue.length-1]:queue[rear-1];
		}
		
		public boolean isEmpty() {
			return count==0;
		}
		
		public boolean isFull() {
			return count==queue.length;
		}
	
	public static void main(String[] args) {
		Problem_82_Queue_MyCircularQueue circularQueue = new Problem_82_Queue_MyCircularQueue(3); // 设置长度为 3
		 
		System.out.println(circularQueue.enQueue(1));// 返回 true
		 
		System.out.println(circularQueue.enQueue(2)); // 返回 true
		 
		System.out.println(circularQueue.enQueue(3)); // 返回 true
		 
		System.out.println(circularQueue.enQueue(4)); // 返回 false，队列已满
		 
		System.out.println(circularQueue.Rear()); // 返回 3
		 
		System.out.println(circularQueue.isFull());// 返回 true
		 
		System.out.println(circularQueue.deQueue()); // 返回 true
		 
		System.out.println(circularQueue.enQueue(4));// 返回 true
		 
		System.out.println(circularQueue.Rear()); // 返回 4
	}
}
