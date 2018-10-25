package bu;

import java.util.Scanner;

/** 
* @author nilzxq
* @version 2018年10月5日 下午1:57:49 
* 类说明 
*/
public class FindMaxKthNum {

	public static int sortArr(int[] arr,int k) {
		
	        int temp;
			if(k<1||k>arr.length) {
				return -1;
			}
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr.length;j++) {
					if(arr[i]<arr[j]) {
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			for(int i=0;i<=k-1;i++) {
				if(i==k-1){
					return arr[k-1];
				}
			
			}
	        return 0;
	    }
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		  String read = in.nextLine();
		  //System.out.println(read);
		  //System.out.println(read.charAt(0));
		
			String arr=in.nextLine();
	}
}
