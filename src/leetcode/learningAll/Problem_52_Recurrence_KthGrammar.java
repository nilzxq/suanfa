package leetcode.learningAll;
/**
* @author nilzxq
* @version 2019年12月21日 下午4:30:41
*类说明
*/
public class Problem_52_Recurrence_KthGrammar {

	public static int kthGrammar(int N,int K) {
		if(N==1) {
			return 0;
		}
		if(K%2==0) {
			return kthGrammar(N-1,K/2)==0?1:0;
		}else {
			return kthGrammar(N-1,(K+1)/2)==0?0:1;
		}
	}

	public static void main(String[] args) {
		System.out.println(kthGrammar(2,1));
	}
}
