package interview.携程;

import java.util.*;

/**
 * @Author nilzxq
 * @Date 2020-09-08 19:30
 */
public class M1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String jc=sc.nextLine();
        String dis=sc.nextLine();
        char[] cha=str.toCharArray();
        //String[] st=jc.split("\\s");
        List<String> res=new ArrayList<>();
        helper(res,cha,0);
        String[] num=new String[res.size()];
        num[0]=jc.replaceAll(res.get(0),dis);
        for(int i=1;i<res.size();i++){
            num[i]=num[i-1].replaceAll(res.get(i),dis);
        }
        //String res=jc.replaceAll(str,dis);
        System.out.println(num[res.size()-1]);

    }

    public static void helper(List<String> res,char[] strs,int begin){
        if(begin==strs.length-1){
            res.add(String.valueOf(strs));
        }
        for(int i=begin;i<strs.length;i++){
            swap(strs,i,begin);
            helper(res,strs,begin+1);
            swap(strs,i,begin);
        }
    }

    public static void swap(char[] strs,int index1,int index2){
        char temp=strs[index1];
        strs[index1]=strs[index2];
        strs[index2]=temp;
    }
}
