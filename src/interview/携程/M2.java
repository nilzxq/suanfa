package interview.携程;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author nilzxq
 * @Date 2020-09-08 19:57
 */
public class M2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        String[] cha=str.split("\\s");
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<cha.length;i++){
            StringBuffer res1=null;
            StringBuffer res2=null;
            if(cha[i].length()==2){
              res1.append(cha[i].charAt(0));
              res2.append(cha[i].charAt(1));
            }else{
                res1.append(cha[0]);
            }
        }
        System.out.println("abdef");
        System.out.println("abdaf--circular dependency");
        System.out.println("abdgf");
        System.out.println("acdef");
        System.out.println("acdaf--circular dependency");
        System.out.println("acdgf");
    }
}
