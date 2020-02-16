package leetcode;

import java.util.HashMap;

/** 
* @author nilzxq
* @version 2020年2月16日 下午3:45:58 
*类说明 
*/
public class Problem_107_HashMap_FourSumCount {

	 public static int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
	        HashMap<Integer,Integer> map=new HashMap<>();
	        int count=0;
	        for(int i=0;i<A.length;i++) {
	        	for(int j=0;j<A.length;j++) {
	        		map.put(A[i]+B[j], map.getOrDefault(A[i]+B[j],0)+1);
	        	}
	        }
	        for(int i=0;i<C.length;i++) {
	        	for(int j=0;j<D.length;j++) {
	        		count+=map.getOrDefault(-C[i]-D[j],0);
	        	}
	        }
	        return count;
	    }
	 
	 public static void main(String[] args) {
		 int[] A= {1,2},B= {-2,-1},C= {-1,2},D= {0,2};
		 System.out.println(fourSumCount(A,B,C,D));
	}
}
