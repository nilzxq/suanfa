package book_2018_07_24_stack;

import java.util.LinkedList;

/** 
* @author nilzxq
* @version 2018年8月7日 上午10:20:32 
* 类说明 
*/
public class GetMaxWindow {

	public static int[] getMaxWindow(int[] arr,int w) {
		if(arr==null||w<1||arr.length<w) {
			return null;
		}
		LinkedList<Integer> qmax=new LinkedList<Integer>();
		int[] res=new int[arr.length-w+1];
		int index=0;
		for(int i=0;i<arr.length;i++) {
			while(!qmax.isEmpty()&&arr[qmax.peekLast()]<=arr[i]) {
				qmax.pollLast();
			} 
			qmax.addLast(i);
			if(qmax.peekFirst()==i-w)
				qmax.pollFirst();
			if(i>=w-1) {
				res[index++]=arr[qmax.peekFirst()];
			}
		}
		return res;
	}
	// for test
		public static void printArray(int[] arr) {
			for (int i = 0; i != arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}

	public static void main(String[] args) {
		int[] arr={ 4, 3, 5, 4, 3, 3, 6, 7 };
		int w=3;
		printArray(getMaxWindow(arr,w));
	}
}
