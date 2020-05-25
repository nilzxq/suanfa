package leetcode;
/** 
* @author nilzxq
* @version 2020年5月25日 下午9:48:25 
*类说明 
*/
public class Problem_GenerateMatrix {
	public int[][] generateMatrix(int n){
		int[][] a=new int[n][n];
		int i=0;
		int count=1;
		while(count<=n*n) {
			for(int j=i;j<n-i;j++) {
				a[i][j]=count;
				count++;
			}
			for(int j=i+1;j<n-i;j++) {
				a[j][n-i-1]=count;
				count++;
			}
			for(int j=n-i-2;j>=i;j--) {
				a[n-i-1][j]=count;
				count++;
			}
			for(int j=n-i-2;j>i;j--) {
				a[j][i]=count;
				count++;
			}
			i++;
		}
		return a;
	}
	
	public static void main(String[] args) {
		Problem_GenerateMatrix generate=new Problem_GenerateMatrix();
		int n=3;
		int[][] a=generate.generateMatrix(n);
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
