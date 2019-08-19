package chapter_7_bitoperation;
/** 
* @author nilzxq
* @version 2019年8月19日 下午7:34:47 
*类说明 
*/
public class Problem_01_SwapWithoutTmp {

	public static void main(String[] args) {
		//a和b异或的结果记为c,c就是a整数位信息和b整数位信息的所有不同信息。
		//a异或c的结果就是b
		//b异或c的结果就是a
		int a = 16;
		int b = 111;
		System.out.println(a);
		System.out.println(b);
		//a变成了c,b还是b
		a=a^b;
		//a仍然是c,b变成了a
		b=a^b;
		//a变成了b,b仍然是a
		a=a^b;
		System.out.println(a);
		System.out.println(b);
	}
}
