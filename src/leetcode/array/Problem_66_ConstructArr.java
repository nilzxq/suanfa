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

    /**
     * 上三角和下三角
     * @param a
     * @return
     */
    public static int[] constructArr1(int[] a){
        if(a.length==0){
            return new int[0];
        }
        int[] b=new int[a.length];
        int temp=1;
        b[0]=1;
        for(int i=1;i<a.length;i++){
            b[i]=b[i-1]*a[i-1];
        }
        for(int j=a.length-2;j>=0;j--){
            temp*=a[j+1];
            b[j]*=temp;
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
