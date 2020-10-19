package interview.pinankeji;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @Author nilzxq
 * @Date 2020-10-19 20:43
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] strs=str.split("\\s+");

       int[] res=new int[strs.length];
        for(int i=0;i<res.length;i++){
            res[i]=Integer.parseInt(strs[i]);
        }

        for(int i=0;i<res.length-1;i++){
            for(int j=i+1;j<res.length;j++){
                if(res[j]!=-222){
                    if(res[i]==res[j]){
                        res[j]=-222;
                    }
                }
            }
        }
        
        for(int i=0;i<res.length-1;i++){
            if(res[i]!=-222){
                System.out.println(res[i]+" ");
            }
        }
        if(res[res.length-1]!=-222){
            System.out.println(res[res.length-1]);
        }
    }

}
