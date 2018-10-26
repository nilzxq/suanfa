package bu;
/** 
* @author nilzxq
* @version 2018年10月26日 下午3:17:03 
* 类说明 
*/
public class TopKPath {

	public static int topkpath(int m,int n) {
		int[][] result=new int[m][n];
		//第一列的值
		for(int i=0;i<m;i++) {
			result[i][0]=1;
		}
		//第一行的值
		for(int i=1;i<n;i++) {
			result[0][i]=1;
		}
		//其他位置的解
		for(int i=1;i<m;i++) {
			for(int j=1;j<n;j++) {
				result[i][j]=result[i-1][j]+result[i][j-1];
			}
		}
		return result[m-1][n-1];
	}
	
	public static void main(String[] args) {
		int result=topkpath(3, 7);
		System.out.println(result);
	}
}
