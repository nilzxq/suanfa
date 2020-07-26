package leetcode.string;

import java.util.*;

/**
 * @Author nilzxq
 * @Date 2020-07-26 15:01
 */
public class ReplaceSpace {
//    public static String replaceSpace(StringBuffer str){
//        return str.toString().replaceAll("\\s","%20");
//    }
//
//    public static void main(String[] args) {
//        StringBuffer s=new StringBuffer("hello w " );
//        System.out.println(replaceSpace(s));
//    }

    public static String replaceSpace(String[] strs){
        if(!checkStrs(strs)){
            return "";
        }
        int len=strs.length;
        StringBuilder res=new StringBuilder();
        Arrays.sort(strs);
//        for(int i=0;i<strs.length;i++){
//            System.out.print(strs[i]+" ");
//        }
        int m=strs[0].length();
        int n=strs[len-1].length();
        int min=Math.min(m,n);
        for(int i=0;i<min;i++){
            if(strs[0].charAt(i)==strs[len-1].charAt(i)){
                res.append(strs[0].charAt(i));
            }else{
                break;
            }
        }
        return res.toString();
    }

    private static boolean checkStrs(String[] strs){
        boolean flag=false;
        if(strs!=null){
            for(int i=0;i<strs.length;i++){
                if(strs[i]!=null&&strs[i].length()!=0){
                    flag=true;
                }else{
                    flag=false;
                    break;
                }
            }
        }
        return flag;
    }

    public static int count(String s1,String s2){
        int res=0;
        int m=s1.length();
        int n=s2.length();
        for(int i=0;i<Math.min(m,n);i++){
            if(s1.charAt(i)==s2.charAt(i)){
                res++;
            }
            else {
                return res;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        String[] str=new String[n];
        scanner.nextLine();
        for(int i=0;i<n;i++){
            str[i]=scanner.nextLine();
        }
        while(scanner.hasNext()){
            int a=scanner.nextInt(),b=scanner.nextInt();
            System.out.println(count(str[a-1],str[b-1]));
        }

//        String[] str={"dog","dd","ds"};
//        System.out.print(replaceSpace(str));
    }
}
