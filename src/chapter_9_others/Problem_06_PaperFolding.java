package chapter_9_others;
/** 
* @author nilzxq
* @version 2019年9月27日 下午3:26:47 
*类说明 
*/
public class Problem_06_PaperFolding {

	public static void printAllFolds(int N) {
		printProcess(1,N,true);
	}
	
	public static void printProcess(int i,int N,boolean down) {
		if(i>N) {
			return;
		}
		printProcess(i+1,N,true);
		System.out.println(down?"down ":"up ");
		printProcess(i+1,N,false);
	}
	
	public static void main(String[] args) {
		int N = 4;
		printAllFolds(N);

	}
}
