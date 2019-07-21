package chapter_4_recursionanddp;
/** 
* @author nilzxq
* @version 2019年7月21日 上午9:24:10 
* 类说明 
*/
public class Problem_17_NQueens {

	public static int num1(int n) {
		if(n<1) {
			return 0;
		}
		int[] record=new int[n];
		return process1(0,record,n);
	}
	
	public static int process1(int i,int[] record,int n) {
		if(i==n) {
			return 1;
		}
		int res=0;
		for(int j=0;j<n;j++) {
			if(isValid(record,i,j)) {
				record[i]=j;
				res+=process1(i+1, record, n);
			}
		}
		return res;
	}
	
	public static boolean isValid(int[] record,int i,int j) {
		for(int k=0;k<i;k++) {
			if(j==record[k]||Math.abs(record[k]-j)==Math.abs(i-k)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int n = 8;

		long start = System.currentTimeMillis();
		//System.out.println(num2(n));
		long end = System.currentTimeMillis();
		//System.out.println("cost time: " + (end - start) + "ms");

		start = System.currentTimeMillis();
		System.out.println(num1(n));
		end = System.currentTimeMillis();
		System.out.println("cost time: " + (end - start) + "ms");

	}
}

