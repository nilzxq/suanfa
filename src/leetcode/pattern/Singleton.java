package leetcode.pattern;

/**
 * 单例模式 懒汉模式
 * @Author nilzxq
 * @Date 2020-10-11 23:12
 */
public class Singleton {
    //私有构造函数
    private Singleton(){

    }

    //单例对象
    private static volatile Singleton instance=null;

    public static Singleton getInstance(){

        //双重检测机制：两次判空的机制
        if(instance==null){
            synchronized (Singleton.class){
                if(instance==null){
                    instance=new Singleton();
                }
            }
        }
        return instance;
    }
}
