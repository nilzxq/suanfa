package interview.yidong;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.util.Scanner;

/**
 *
 * Henry是一名漫画作家，每当有新的漫画上架Henry都会去书店举办签售会。
 * 国庆期间他印刷了一批最新出版的漫画书，并计划举行签售会。Henry的书卖的非常火爆，
 * 他每举办一场签售会就能卖出这批书的一半多一本。N场签售会下来，Henry的书只剩下两本。
 * 请你编程帮助Henry计算这批一共出版了多少本漫画书和每场签售会所卖出的漫画书的数量。
 * @Author nilzxq
 * @Date 2020-10-18 19:29
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] arr=new int[num+1];
        arr[0]=4;
        for(int i=1;i<=num;i++){
            arr[i]=arr[i-1]*2;
        }
        for(int i=num;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
