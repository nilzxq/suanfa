package leetcode.array;


/**
 * @Author nilzxq
 * @Date 2020-07-27 20:06
 */
public class Problem_04_FindNumberIn2DArray {
    public static void main(String[] args) {
        int[][] matrix={{1,   4,  7, 11, 15},{2,   5,  8, 12, 19},
                {3,   6,  9, 16, 22},{10, 13, 14, 17, 24},{18, 21, 23, 26, 30}};
        int target=5;
        System.out.println(findNumberIn2DArray(matrix,target));
    }

    public static boolean findNumberIn2DArray(int[][] matrix,int target){
        if(matrix==null||matrix.length==0||matrix[0].length==0){
            return false;
        }
        int rows=matrix.length,colums=matrix[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<colums;j++){
                if(matrix[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}
