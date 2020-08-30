package leetcode.array;

import java.util.Arrays;

/**
 * @Author nilzxq
 * @Date 2020-08-30 9:42
 */
public class Problem_66_ConstructArr {
    public static int[] constructArr(int[] arr){
        int[] b=new int[arr.length];
        int j=0;
        Arrays.fill(b,1);
        while(j!=arr.length){
            for(int i=0;i<arr.length;i++){
                if(i!=j){
                    b[j]=arr[i]*b[j];
                    //System.out.println(b[j]);
                }
            }
            j++;
        }

        return b;
    }

    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] b=constructArr(a);
        for(int i=0;i<a.length;i++){
            System.out.print(b[i]+" ");
        }
    }

}
