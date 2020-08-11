package leetcode.learningAll;

import java.util.ArrayList;
import java.util.List;

/**
* @author nilzxq
* @version 2019年12月14日 上午11:47:21
*类说明
*/
public class Problem_45_Other_Generate {

	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> res=new ArrayList<List<Integer>>();
		ArrayList<Integer> row=new ArrayList<Integer>();
		for(int i=0;i<numRows;i++) {
			row.add(0,1);
			for(int j=1;j<row.size()-1;j++) {
				row.set(j, row.get(j)+row.get(j+1));
			}
			res.add(new ArrayList<Integer>(row));
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println(generate(5));
	}
}
