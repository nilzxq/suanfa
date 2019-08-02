package chapter_5_stringproblem;

/** 
* @author nilzxq
* @version 2019年8月2日 下午4:51:38 
*类说明 
*/
public class Problem_12_MinDistance {

	public static int minDistance(String[] strs,String str1,String str2) {
		if(str1==null||str2==null) {
			return -1;
		}
		if(str1==str2) {
			return 0;
		}
		int last1=-1;
		int last2=-1;
		int min=Integer.MAX_VALUE;
		for(int i=0;i!=strs.length;i++) {
			if(strs[i].equals(str1)) {
				min=Math.min(min, last2==-1?min:i-last2);
				last1=i;
			}
			if(strs[i].equals(str2)) {
				min=Math.min(min, last1==-1?min:i-last1);
				last2=i;
			}
		}
		return min==Integer.MAX_VALUE?-1:min;
	}
	
	public static void main(String[] args) {
		String[] strArr = new String[] { "4", "2", "2", "3", "2", "2", "3",
				"1", "1", "3" };
		System.out.println(minDistance(strArr, "4", "3"));
		System.out.println(minDistance(strArr, "2", "3"));
		System.out.println(minDistance(strArr, "2", "1"));
	}
}
