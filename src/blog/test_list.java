package blog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/** 
* @author nilzxq
* @version 2020年5月9日 下午3:22:05 
*类说明 
*/
public class test_list {

	public static long arrayFor() {
	    List<Integer> list = new ArrayList<Integer>();
	    for (int i = 1; i <= 100000; i++) {
	        list.add(i);
	    }
	    //开始时间
	    long startTime = System.currentTimeMillis();

	    for (int j = 0; j < list.size(); j++) {
	        Object num = list.get(j);
	    }

	    //结束时间
	    long endTime = System.currentTimeMillis();

	    //返回所用时间
	    return endTime-startTime;
	}

	public static long arrayIterator() {
	    List<Integer> list = new ArrayList<Integer>();

	    for (int i = 1; i <= 100000; i++) {
	        list.add(i);
	    }
	    long startTime = System.currentTimeMillis();

	    Iterator iterator = list.iterator();
	    while (iterator.hasNext()){
	        Object next = iterator.next();
	    }

	    long endTime = System.currentTimeMillis();

	    return endTime-startTime;
	}
	
	public static void main(String[] args) {
	    long time1 = arrayFor();
	    long time2 = arrayIterator();

	    System.out.println("ArrayList for循环所用时间=="+time1);
	    System.out.println("ArrayList 迭代器所用时间=="+time2);
	}
}
