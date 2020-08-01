package interview;

import java.util.Scanner;

/**
 * @Author nilzxq
 * @Date 2020-07-31 14:54
 * 编程实现一个从字符串输入提取整数的程序，要求尽量多的考虑异常输入的情况
 *
 * 输入一行字符串为待提取的字符串
 * 输出从字符串提取的整数
 */
public class keda4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        int length=str.length();
        char[] cha=str.toCharArray();
        StringBuilder res=new StringBuilder();
        for(int i=0;i<length;i++){
            //System.out.println(cha[i]);
            if(cha[i]>='0'&&cha[i]<='9'){
                res.append(cha[i]);
            }
        }
        int sum=0;
        for(int i=0;i<res.length();i++){
            System.out.println(res.charAt(i)-'0');
            sum=sum*10+(res.charAt(i)-'0');
        }
        System.out.println(sum);
    }
}
