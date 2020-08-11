package leetcode.learningAll;
/**
* @author nilzxq
* @version 2020年2月3日 上午11:16:36
*类说明
*/
public class Problem_94_Queue_FloodFill {

	public static int[][] floodFill(int[][] image,int sr,int sc,int newColor){
		if(image[sr][sc]==newColor) return image;
		fill(image,sr,sc,image[sr][sc],newColor);
		return image;
	}

	private static void fill(int[][] image,int sr,int sc,int color,int newColor) {
		if(sr<0||sr>=image.length||sc<0||sc>=image[0].length||image[sr][sc]!=color) return;
		image[sr][sc]=newColor;
		fill(image,sr+1,sc,color,newColor);
		fill(image,sr-1,sc,color,newColor);
		fill(image,sr,sc+1,color,newColor);
		fill(image,sr,sc-1,color,newColor);
	}

	public static void main(String[] args) {
		int[][] image= {{1,1,1},{1,1,0},{1,0,1}};
		int sr=1,sc=1,newColor=2;
		int[][] newImage=floodFill(image,sr,sc,newColor);
		for(int i=0;i<image.length;i++) {
			for(int j=0;j<image[0].length;j++) {
				System.out.print(newImage[i][j]+" ");
			}
			System.out.println();
		}
	}
}
