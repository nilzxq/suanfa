package bu;

import java.util.Arrays;
import java.util.Scanner;

/** 
* @author nilzxq
* @version 2018年10月6日 下午9:25:13 
* 类说明 
*/
public class InsertSort {

	
	public static void insertSort(int[] a,int l,int r) {
		for(int i=l;i<=r;i++) {
			int tmp=a[i],j=i-1;
			for(;j>=l&&tmp>a[j];j--)a[j+1]=a[j];
			a[j+1]=tmp;
		}
	}
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int s=in.nextInt();
		int[] a=new int[s];
		for(int i=0;i<s;i++) {
			a[i]=in.nextInt();
		}
		//返回指定数组内容的字符串表示形式
		System.out.println(Arrays.toString(a));
		insertSort(a,0,s-1);
		for(int i=0;i<s;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
