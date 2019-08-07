package chapter_5_stringproblem;

import java.util.Arrays;
import java.util.Comparator;

/** 
* @author nilzxq
* @version 2019年8月7日 下午5:13:20 
*类说明 
*/
public class Problem_17_LowestLexicography {

	public static class MyComparator implements Comparator<String>{
		@Override
		public int compare(String arg0, String arg1) {
			return (arg0+arg1).compareTo(arg1+arg0);
		}
	}
	
	public static String lowestString(String[] strs) {
		if(strs==null||strs.length==0) {
			return "";
		}
		//根据新的比较方法排序
		Arrays.sort(strs,new MyComparator());
		String res="";
		for(int i=0;i<strs.length;i++) {
			res+=strs[i];
		}
		return res;
	}
	
	public static void main(String[] args) {
		String[] strs1 = { "jibw", "ji", "jp", "bw", "jibw" };
		System.out.println(lowestString(strs1));

		String[] strs2 = { "ba", "b" };
		System.out.println(lowestString(strs2));

	}

}
