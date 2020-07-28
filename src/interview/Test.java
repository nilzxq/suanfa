package interview;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author nilzxq
 * @Date 2020-07-28 21:35
 */
public class Test {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        //获得构造器
        Constructor con = SingletonEnum.class.getDeclaredConstructor();
        //设置为可访问
        con.setAccessible(true);
        //构造两个不同的对象
        SingletonEnum singleton1 = (SingletonEnum)con.newInstance();
        SingletonEnum singleton2 = (SingletonEnum)con.newInstance();
        //验证是否是不同对象
        System.out.println(singleton1.equals(singleton2));
    }
}
//输出
//Exception in thread "main" java.lang.NoSuchMethodException: interview.SingletonEnum.<init>()
//	at java.lang.Class.getConstructor0(Class.java:3082)
//	at java.lang.Class.getDeclaredConstructor(Class.java:2178)
//	at interview.Test.main(Test.java:13)
