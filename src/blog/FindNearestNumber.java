package blog;

import java.util.Arrays;

/**
 * http://mp.weixin.qq.com/s/_mIeGKdvTOH-1jleJ4aADg
 * 给定一个正整数，实现一个方法来求出离该整数最近的大于自身的“换位数”。
 * 什么是换位数呢？就是把一个整数各个数位的数字进行全排列，从而得到新的整数。
 * 例如53241和23541。
 * 
 * 字典序算法
 * 
 * 1.从后向前查看逆序区域，找到逆序区域的前一位，也就是数字置换的边界
 * 2.把逆序区域的前一位和逆序区域中刚刚大于它的数字交换位置
 * 3.把原来的逆序区域转为顺序
 * 
 * @author ZXQ20
 *
 */
public class FindNearestNumber {

	//主流程，返回最近一个大于自身的相同数字组成的整数
	public static int[] findNearestNumber(int[] numbers) {
		//拷贝入参，避免直接修改入参
		int[] numbersCopy=Arrays.copyOf(numbers,numbers.length);
		//1.从后向前查看逆序区域   找到逆序区域的前一位 也就是数字置换的边界
		int index=findTransferPoint(numbersCopy);
		//如果数字置换边界是0，说明整个数组已经逆序，无法得到最大的相同数字组成的整数，返回自身
		if(index==0) {
			return null;
		}
		//2.把逆序区域的前一位和逆序区域中刚刚大于它的数字交换位置
		exchangeHead(numbersCopy,index);
		//3.把原来逆序区域转为顺序
		reverse(numbersCopy,index);
		return null;
	}
	private static int findTransferPoint(int[] numbers) {
	     for(int i=numbers.length-1;i>0;i--) {
	    	 if(numbers[i]>numbers[i-1]) {
	    		 return i;
	    	 }
	     }
		return 0;
	}

	private static int[] exchangeHead(int[] numbers, int index) {
      int head=numbers[index-1];
      for(int i=numbers.length-1;i>0;i--) {
    	  if(head<numbers[i]) {
    		  numbers[index-1]=numbers[i];
    		  numbers[i] = head;
    		  break;
    	  }
      }
		return numbers;
	}

	private static int[] reverse(int[] num, int index) {

		for(int i=index,j=num.length-1;i<j;i++,j--) {
			int temp=num[i];
			num[i]=num[j];
			num[j]=temp;
		}
		return num;
	}
	
	public static void main(String[] args) {
		int[] numbers= {1,2,3,4,5};
		for(int i=0;i<10;i++) {
			numbers=findNearestNumber(numbers);
			outputNumbers(numbers);
		}
	}
	
	//输出数组
	private static void outputNumbers(int[] numbers){
	    for(int i : numbers){   
	     System.out.print(i);
	    }
	    System.out.println();
	}
}
