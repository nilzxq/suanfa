package test;

/**
 * @Author nilzxq
 * @Date 2020-09-23 18:08
 */
public class Test {
    public static class A {

    }

    public static class B extends A {

    }

    public static void method1(A a) {
        if (a instanceof A) {
            System.out.println("A类对象");
        } else if (a instanceof B) {
            System.out.println("B");
        }
    }

//    public static void main(String[] args) {
//        method1(new A());
//        method1(new B());
//    }
}



