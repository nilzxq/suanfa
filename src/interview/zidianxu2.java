package interview;

import java.util.Scanner;

/**
 * @Author nilzxq
 * @Date 2020-08-26 16:24
 */
public class zidianxu2 {

    //转化成26进制
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for(int i =0;i<number;i++){
            int len = sc.nextInt();
            String word1 =  sc.next();
            String word2 = sc.next();
            char []array1 = word1.toCharArray();
            char []array2 = word2.toCharArray();
            long sum1 = 0;
            long sum2 = 0;
            for(int j = len-1;j>=0;j--){
                int temp1 = (int)array1[j]-97;
                int temp2 = (int)array2[j]-97;
                sum1+=temp1*Math.pow(26,len-1-j);
                sum2+=temp2*Math.pow(26,len-1-j);
            }
            if((sum2-sum1)>0){
                System.out.println(sum2-sum1-1);
            }else{
                System.out.println(0);
            }
        }
    }
}
