package leetcode;

import java.util.Arrays;

/** 
* @author nilzxq
* @version 2019年12月8日 下午3:57:21 
*类说明 
*/
public class Problem_39_Math_CountPrimes {

	public static int countPrimes(int n) {
		if(n<3) {
			return 0;
		}
		if(n==3) {
			return 1;
		}
		int count=0;
		boolean[] mark=new boolean[n];
		mark[2]=false;
		//先标记2
		for(int i=3;i<n;i++) {
			if(i%2==0) {
				mark[i]=true;
			}else {
				mark[i]=false;
			}
		}
		
		for(int i=3;i<n;i+=2) {
			//之后第一个未被划去的
			if(!mark[i]) {
				if(i*i>n) {
					//当前素数的平方大于n,跳出循环
					break;
				}
				//打标记(j是倍数)
				for(int j=2;i*j<n;++j) {
					mark[i*j]=true;
				}
			}
		}
		//计数
		for(int i=2;i<n;i++) {
			if(!mark[i]) {
				count++;
			}
		}
		return count++;
	}
	
	 public static int countPrimes2(int n) {
	        if (n == 0) return 0;
	        
	        boolean[] arr = new boolean[n];
	        for (int i = 0; i < n; i++) {
	            arr[i] = true;
	        }

	        arr[0] = false;
	        int count = 0;
	        int limit = (int)Math.sqrt(n);
	        // 埃拉托斯特尼筛法
	        for (int i = 2; i <= limit; i++) {
	            if (arr[i - 1]) {
	                // 把能被整除的数字标识出来
	                for (int j = i * i; j < n; j += i) {
	                    arr[j - 1] = false;
	                }
	            }
	        }
	        
	        for (int i = 2; i < n; i++) {
	            if (arr[i]) {
	               count += 1;
	            }
	        }
	        
	        return count;
	    }
	 
	 public static int countPrimes3(int n) {
		    boolean[] isPrim = new boolean[n];
		    Arrays.fill(isPrim, true);
		    for (int i = 2; i * i < n; i++)
		        if (isPrim[i])
		            for (int j = i * i; j < n; j += i)
		                isPrim[j] = false;
		    
		    int count = 0;
		    for (int i = 2; i < n; i++)
		        if (isPrim[i]) count++;
		    
		    return count;
		}
	 
	public static void main(String[] args) {
		System.out.println(countPrimes(10));
		System.out.println(countPrimes2(10));
		System.out.println(countPrimes3(10));
	}
}
