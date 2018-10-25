package bilibili;

import org.omg.PortableServer.ID_ASSIGNMENT_POLICY_ID;

/** 
* @author nilzxq
* @version 2018年9月21日 上午8:34:01 
* 类说明 
*/
public class Code_01_NetherlandsFlag {

	public static int[] partition(int[] arr,int L,int R,int num) {
		int less=L-1;
		int more=R-1;
		int i=L;
		while(i<more) {
			if(arr[i]<num) {
				swap(arr,++less,i++);
			}else if(arr[i]>num) {
				swap(arr,--more,i);
			}else {
				i++;
			}
		}
		return new int[] {less+1,more-1};
	}
	
	//for test
	public static void swap(int[]arr,int i,int j) {
		int tmp=arr[i];
		arr[i]=arr[j];
		arr[j]=tmp;
	}
}
