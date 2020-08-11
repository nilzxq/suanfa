package leetcode.learningAll;

import java.util.ArrayList;
import java.util.List;

/**
* @author nilzxq
* @version 2019年12月7日 下午7:53:53
*类说明
*/
public class Problem_38_Math_FizzBuzz {

	public static List<String> fizzBuzz(int n){
	List<String> list=new ArrayList<String>();
	for(int i=1;i<=n;i++) {
		if(i%15==0) {
			list.add("FizzBuzz");
		}else if(i%3==0) {
			list.add("Fizz");
		}else if(i%5==0) {
			list.add("Buzz");
		}else {
			list.add(i+"");
		}
	}
	return list;
	}

	public static void main(String[] args) {
		int n=15;
		System.out.println(fizzBuzz(n));
	}
}
