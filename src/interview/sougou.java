package interview;

import com.sun.scenario.animation.shared.ClipEnvelope;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * @Author nilzxq
 * @Date 2020-09-05 18:41
 */
public class sougou {
    public static int numberofprize (int a, int b, int c) {
        // write code here
        Integer[] arr=new Integer[3];
        arr[0]=a;
        arr[1]=b;
        arr[2]=c;

//        int count=arr[0];
//        arr[1]-=arr[0];
//        arr[2]-=arr[0];
//        count+=(arr[1]+arr[2])/3;
        int count=0;
        int sum=a+b+c;
        int avg=sum/3;

        for(int i=0;i<sum/3;i++){
            Arrays.sort(arr, Collections.reverseOrder());
            if(arr[0]-2>arr[2]){
                arr[0]=arr[0]-2;
                arr[2]++;
            } else if(arr[0]>arr[2]&&arr[1]>arr[2]){
                arr[0]-=1;
                arr[1]-=1;
                arr[2]+=1;
            }else{
                break;
            }
        }
        return arr[2];
    }

//    public class MyComparator implements Comparator<Integer>{
//
//    }

    public static void main(String[] args) {
        System.out.print(numberofprize(9,3,3));
    }

    class House{
        int left;
        int right;
    }

    public int getHouses (int t, int[] xa) {
        // write code here
        int length=xa.length;
        int num=1;
        for(int i=0;i<xa.length/2;i=i+2){
            int right=xa[i]+xa[1+i]/2;
            if(3+i>length-1){
                num++;
                break;
            }
            int left=xa[2+i]-xa[3+i]/2;
            if(left-right>t){
                num+=2;
            }else if(left-right==t){
                num++;
            }
        }
        return num;
    }

    public long getPasswordCount (String password) {
        // write code here
        if(password.length()==1){
            return 9;
        }
        char[] cha=password.toCharArray();
        StringBuilder str=new StringBuilder();
//        for(int i=0;i<password.length();i++){
//            str[0]
//        }
        return 15;
    }
}
