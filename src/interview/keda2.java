package interview;

import java.util.Scanner;

/**
 * @Author nilzxq
 * @Date 2020-07-31 14:42
 * 9
 * 25 84 21 47 15 27 68 35 20
 *
 * 15 20 21 25 47 27 68 35 84
 * 15 20 21 25 47 27 68 35 84
 * 15 20 21 25 47 27 68 35 84
 * 15 20 21 25 35 27 47 68 84
 * 15 20 21 25 27 35 47 68 84
 * 15 20 21 25 27 35 47 68 84
 */
public class keda2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int count= scanner.nextInt();
        int[] arr=new int[count];
        for(int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }
        scanner.nextInt();
    }
}
