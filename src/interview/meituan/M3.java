package interview.meituan;

import java.util.Scanner;

/**
 * @Author nilzxq
 * @Date 2020-09-20 10:54
 */
public class M3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        sc.nextLine();
        String t=sc.nextLine();
        String s=sc.nextLine();
        int i=0,j=0;
        char[] cha1=s.toCharArray();
        char[] cha2=t.toCharArray();
        int count=0;
        if(s.equals("")){
            System.out.println("Yes");
            System.out.println(0);
            return;
        }else if(t.equals("")){
            System.out.println("No");
            return;
        }else if(cha2.length==1&&cha2[0]!=cha1[0]){
            System.out.println("No");
            return;
        }else if(m>n){
            System.out.println("No");
            return;
        }else{
            while(i<cha1.length&&j<cha2.length){
                if(cha1[i]==cha2[j]){
                    count+=j+1;
                    i++;
                    j++;
                }else{
                    j++;
                }
            }
            if(i==cha1.length){
                System.out.println("Yes");
                System.out.println(count);
                return;
            }else{
                System.out.println("No");
                return;
            }
        }

    }

}
