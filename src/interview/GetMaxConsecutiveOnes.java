package interview;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author nilzxq
 * @Date 2020-09-04 19:31
 */
public class GetMaxConsecutiveOnes {
    public int GetMaxConsecutiveOnes (int[] arr, int k) {
        // write code here
        int l=0,r=0,res=0,cnt=0;
        while(r<arr.length){
            if(arr[r]==0){
                cnt++;
            }
            while(cnt>k){
                if(arr[l++]==0){
                    cnt--;
                }
            }
            res=Math.max(res,r-l+1);
            r++;
        }
        return res;
    }

    //顺时针打印矩阵
    ArrayList<Integer> list=new ArrayList<>();
    int[] arr;
    public int[] SpiralMatrix (int[][] matrix) {
        // write code here
        int n=matrix.length;
        int m=matrix[0].length;
        arr=new int[n*m];
        if(matrix==null||matrix.length==0){
            return arr;
        }
        int a=0,b=0;
        int c=matrix.length-1,d=matrix[0].length-1;
        while(a<=c&&b<=d){
            helper(matrix,a++,b++,c--,d--);
        }
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }

    private void helper(int[][] matrix, int a, int b, int c, int d) {
        if(a==c){
            for(int i=b;i<=d;i++){
                list.add(matrix[a][i]);
            }
        }else if(b==d){
            for(int i=a;i<=c;i++){
                list.add(matrix[i][b]);
            }
        }else{
            int curR=a;
            int curC=b;
            while(curC!=d){
                list.add(matrix[curR][curC++]);
            }
            while(curR!=c){
                list.add(matrix[curR++][curC]);
            }
            while(curC!=b){
                list.add(matrix[curR][curC--]);
            }
            while(curR!=a){
                list.add(matrix[curR--][curC]);
            }
        }
    }

    //字符串碎片
    public int GetFragment (String str) {
        // write code here
      int length=str.length();
      char cha=str.charAt(0);
      int j=0;
      for(int i=0;i<length;i++){
          if(cha!= str.charAt(i)){
              j++;
              cha=str.charAt(i);
              i--;
          }
      }
      j++;
      return length/j;
    }
}
