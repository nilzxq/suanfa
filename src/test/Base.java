package test;

import java.util.Scanner;

/**
 * @Author nilzxq
 * @Date 2020-09-23 18:23
 */
public class Base {


    public static final String FOO = "foo";

    public static void main(String[] args) {
//        Base b = new Base();
//        Sub s = new Sub();
//        System.out.print(Base.FOO);
//        System.out.print(Sub.FOO );
//        System.out.print(b.FOO);
//        System.out.print(s.FOO);
//        System.out.print(((Base) s).FOO);
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(num);
        try{

        }catch (ArrayIndexOutOfBoundsException  | NullPointerException ex){

        }




    }
}

