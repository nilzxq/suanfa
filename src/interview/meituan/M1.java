package interview.meituan;

import java.util.Scanner;

/**
 * @Author nilzxq
 * @Date 2020-09-20 10:06
 */
public class M1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();

       // System.out.println(helper(a,b));

        System.out.println(helper2(100000));
    }

    public static int helper(int a,int b){
//        String str1=a+"";
//        String str2=b+"";
        int count=0;
        for(int i=a;i<=b;i++){
            if(helper1(i)==true){
                String str=i+"";
                //System.out.println(str);
                if(Integer.valueOf(str.charAt(0)-'0')*10+Integer.valueOf(str.charAt(1)-'0')+
                        Integer.valueOf(str.charAt(2)-'0')*10+Integer.valueOf(str.charAt(3)-'0')==
                                Integer.valueOf(str.charAt(4)-'0')*10+Integer.valueOf(str.charAt(5)-'0')){
                    count++;
                }
            }else{
                continue;
            }
        }
        return count;
    }

    public static int helper2(int a){
//        String str1=a+"";
//        String str2=b+"";
        int count=0;

            if(helper1(a)==true){
                String str=a+"";
//                System.out.println(str);
//                System.out.println(Integer.valueOf(str.charAt(0)-'0')*10);
//                System.out.println(str.charAt(1));
//                System.out.println(str.charAt(2)*10);
//                System.out.println(str.charAt(3));
//                System.out.println(str.charAt(4)*10);
//                System.out.println(str.charAt(5));


                if(Integer.valueOf(str.charAt(0)-'0')*10+Integer.valueOf(str.charAt(1)-'0')+
                        Integer.valueOf(str.charAt(2)-'0')*10+Integer.valueOf(str.charAt(3)-'0')==
                        Integer.valueOf(str.charAt(4)-'0')*10+Integer.valueOf(str.charAt(5)-'0')){
                    count++;
                }
            }

        return count;
    }

    public static boolean helper1(int num){
        String str=num+"";
        if(str.length()<6){
            return false;
        }
        for(int i=0;i<6;i++){
            if(i%2==0&&Integer.valueOf(str.charAt(i)-'0')==0){
                return false;
            }
            for(int j=0;j<6;j++){
                if(i!=j&&str.charAt(i)==str.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
}
