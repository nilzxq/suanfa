package leetcode.learningAll;

import java.util.ArrayList;
import java.util.List;

/**
* @author nilzxq
* @version 2019年12月27日 下午6:40:27
*类说明
*/
public class Problem_57_Array_SpiralOrder {

	/**
	 * 就按照四步走就可以:
	left -> right
	top -> bottom
	right -> left
	bottom -> top
	 * @param matrix
	 * @return
	 */
	public static List<Integer> spiralOrder(int[][] matrix){
		List<Integer> res=new ArrayList<Integer>();
		if(matrix.length==0||matrix[0].length==0) return res;
		int top=0;
		int bottom=matrix.length-1;
		int left=0;
		int right=matrix[0].length-1;
		while(true) {
			for(int i=left;i<=right;i++) res.add(matrix[top][i]);
			top++;
			if(left>right||top>bottom) break;
			for(int i=top;i<=bottom;i++) res.add(matrix[i][right]);
			right--;
			if(left>right||top>bottom) break;
			for(int i=right;i>=left;i--) res.add(matrix[bottom][i]);
			bottom--;
			for(int i=bottom;i>=top;i--) res.add(matrix[i][left]);
			left++;
			if(left>right||top>bottom) break;
		}
		return res;
	}

	public static void main(String[] args) {
		int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		System.out.println(spiralOrder(a));
	}
}
