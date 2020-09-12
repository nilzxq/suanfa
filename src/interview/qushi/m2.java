package interview.qushi;

import java.util.Scanner;

/**
 * @Author nilzxq
 * @Date 2020-09-12 20:00
 */
public class m2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n=sc.nextLine();
        int k=sc.nextInt();
        int newL=n.length()-k;
        char[] cha=new char[n.length()];
        int top=0;
        for(int i=0;i<n.length();i++){
            char c=n.charAt(i);
            while(top>0&&cha[top-1]>c&&k>0){
                top-=1;
                k-=1;
            }
            cha[top]=c;
            top++;
        }
        int offset=0;
        while(offset<newL&&cha[offset]=='0'){
            offset++;
        }
       String res=offset==newL?"0":new String(cha,offset,newL-offset);
        System.out.println(res);
    }
}
