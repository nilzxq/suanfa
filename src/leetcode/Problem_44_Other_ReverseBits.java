package leetcode;
/** 
* @author nilzxq
* @version 2019年12月13日 下午5:33:45 
*类说明 
*/
public class Problem_44_Other_ReverseBits {

	public static int reverseBits(int n) {
		int result=0;
       for(int i=0;i<32;i++) {
    	   int temp=n&1;
    	   n=n>>1;
       result=result<<1;
       result=result|temp;
        }
        return result;
    }
	
}
