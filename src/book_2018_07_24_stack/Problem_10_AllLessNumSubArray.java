package book_2018_07_24_stack;

import java.util.LinkedList;

/** 
* @author nilzxq
* @version 2018年8月21日 上午10:55:17 
* 类说明 
*/
public class Problem_10_AllLessNumSubArray {

	public static int getNum(int[] arr,int num) {
		if(arr==null||arr.length==0) {
			return 0;
		}
		LinkedList<Integer> qmin=new LinkedList<Integer>();
		LinkedList<Integer> qmax=new LinkedList<Integer>();
		int i=0;
		int j=0;
		int res=0;
		while(i<arr.length) {
			while(j<arr.length) {
				while(!qmin.isEmpty()&&arr[qmin.peekFirst()]>=arr[j]) {
					qmin.pollLast();
				}
				qmin.addLast(j);
				while(!qmax.isEmpty()&&arr[qmax.peekFirst()]<=arr[j]) {
					qmax.pollLast();
				}
				qmax.addLast(j);
				if(arr[qmax.getFirst()]-arr[qmin.getFirst()]>num) {
					break;
				}
				j++;
				}
			if(qmin.peekFirst()==i) {
				qmin.pollFirst();
			}
			if(qmax.peekFirst()==i) {
				qmax.pollFirst();
			}
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
