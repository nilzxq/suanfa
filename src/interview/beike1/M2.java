package interview.beike1;

import java.util.*;

/**
 * @Author nilzxq
 * @Date 2020-09-07 15:40
 */
public class M2 {
    static String res=" ";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str=sc.next();
        boolean flag=false;
        for(int i=n/2;i>1;i--){
            String s1=str.substring(0,i);
            String s2=str.substring(i,2*i);
            if(s1.equals(s2)){

            }
        }
        ArrayList<String> list=new ArrayList<>();
        for(int i=n-1;i>=0;i--){
            list.add(str.substring(i));
        }
        Collections.sort(list);
        int maxL=0;
        for(int i=0;i<str.length()-1;i++){
            int len=getComlen(list.get(i),list.get(i+1));
            maxL=Math.max(maxL,len);
            res=list.get(i).substring(0,maxL-1);
        }
        System.out.println(res);
        System.out.println();
//        char[] cha=new char[n];
//        cha=str.toCharArray();
//        HashSet<Character> set=new HashSet<>();
//        int count=0;
//        for(char ch:cha){
//            if(!set.contains(ch)){
//                count++;
//            }
//        }
//        for(int i=0;i< cha.length;i++){
//            for(int j=0;j<cha.length;j++){
//                if(cha[i]==cha[j]){
//
//                }
//            }
//        }
//        System.out.println(count);
//        //DP

    }

    private static int getComlen(String str1, String str2) {
        int i;
        for(i=0;i<str1.length()&&i<str2.length();i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                break;
            }
        }
        String temp=str1.substring(0,i);
        if(temp.length()>res.length()){
            res=temp;
        }
        return i;
    }


}
