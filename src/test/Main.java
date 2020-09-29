package test;

import com.sun.org.apache.xpath.internal.operations.String;

/**
 * @Author nilzxq
 * @Date 2020-09-24 19:22
 */
public class Main {
    public static void changeStringBuffer(StringBuffer m,StringBuffer n){
        m.append(" world");
        n=m;
    }

    public static void main(String[] args) {
        final StringBuffer str_m=new StringBuffer("Hello");
//        StringBuffer str_n=new StringBuffer("Hello");
//        changeStringBuffer(str_m,str_n);
//        System.out.println(str_m);
//        System.out.println(str_n);

    }
}
