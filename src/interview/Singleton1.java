package interview;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author nilzxq
 * @Date 2020-07-28 21:22
 *
 * 1.从外部无法访问静态内部类LazyHolder，只有当调用Singleton.getInstance方法的时候，才能得到单例对象INSTANCE。
 *
 * 2.INSTANCE对象初始化的时机并不是在单例类Singleton被加载的时候，而是在调用getInstance方法，使得静态内部类LazyHolder被加载的时候。因此这种实现方式是利用classloader的加载机制来实现懒加载，并保证构建单例的线程安全。
 */
public class Singleton1 {
    public static class LazyHolder{
        private static final Singleton1 INSTANCE=new Singleton1();
    }
    private Singleton1(){}
    public static Singleton1 getInstance(){
        return LazyHolder.INSTANCE;
    }

    /**
     * 第一步，获得单例类的构造器。
     *
     * 第二步，把构造器设置为可访问。
     *
     * 第三步，使用newInstance方法构造对象。
     *
     * 最后为了确认这两个对象是否真的是不同的对象，我们使用equals方法进行比较。毫无疑问，比较结果是false。
     * @param args
     * @throws NoSuchMethodException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws InstantiationException
     */

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //利用反射打破单例
        //获得构造器
        Constructor con=Singleton1.class.getDeclaredConstructor();
        //设置可访问
        con.setAccessible(true);
        //构造两个不同的对象
        Singleton1 singleton1=(Singleton1)con.newInstance();
        Singleton1 singleton2=(Singleton1)con.newInstance();
        //验证是否是不同对象
        System.out.println(singleton1.equals(singleton2));
    }
}
