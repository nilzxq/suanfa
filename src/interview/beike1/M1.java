package interview.beike1;

import java.util.Scanner;

/**
 * @Author nilzxq
 * @Date 2020-09-07 15:06
 */
public class M1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            String[] arr=new String[4];
           for(int i=1;i<=n;i++){
               arr[0]=sc.next();
                arr[1]=sc.next();
                arr[2]=sc.next();
                arr[3]=sc.next();
               int left=0;
               int right=0;
               if(arr[0].equals("S")){
                   if(arr[2].equals("J")||arr[3].equals("J")){
                       left++;
                   }
               }else if(arr[0].equals("J")){
                   if(arr[2].equals("B")||arr[3].equals("B")){
                       left++;
                   }
               }else if(arr[0].equals("B")){
                   if(arr[2].equals("S")||arr[3].equals("S")){
                       left++;
                   }
               }
               if(arr[1].equals("S")){
                   if(arr[2].equals("J")||arr[3].equals("J")){
                       right++;
                   }
               }else if(arr[1].equals("J")){
                   if(arr[2].equals("B")||arr[3].equals("B")){
                       right++;
                   }
               }else if(arr[1].equals("B")){
                   if(arr[2].equals("S")||arr[3].equals("S")){
                       right++;
                   }
               }

               if(left>right){
                   System.out.println("left");
               }else if(right>left){
                   System.out.println("right");
               }else{
                   System.out.println("same");
               }
            }
        }

}
