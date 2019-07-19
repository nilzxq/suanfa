package chapter_4_recursionanddp;
/** 
* @author nilzxq
* @version 2019年7月19日 下午8:56:41 
* 类说明 
*/
public class Problem_15_JumpGame {

	public static int jump(int[] arr) {
		if(arr==null||arr.length==0) {
			return 0;
		}
		int jump=0;
		int cur=0;
		int next=0;
		for(int i=0;i<arr.length;i++) {
			if(cur<i) {
				jump++;
				cur=next;
			}
			next=Math.max(next, i+arr[i]);
		}
		return jump;
	}
	
	public static void main(String[] args) {
		int[] arr = { 3, 2, 3, 1, 1, 4 };
		System.out.println(jump(arr));
	}
}
