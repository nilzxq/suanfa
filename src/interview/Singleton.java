package interview;

/**
 * @Author nilzxq
 * @Date 2020-07-28 21:02
 * 1.要想让一个类只能构建一个对象，自然不能让它随便去做new操作，因此Signleton的构造方法是私有的。
 *
 * 2.instance是Singleton类的静态成员，也是我们的单例对象。它的初始值可以写成Null，也可以写成new Singleton()。至于其中的区别后来会做解释。
 *
 * 3.getInstance是获取单例对象的方法。
 *
 * 如果单例初始值是null，还未构建，则构建单例对象并返回。这个写法属于单例模式当中的懒汉模式。
 *
 * 如果单例对象一开始就被new Singleton()主动构建，则不再需要判空操作，这种写法属于饿汉模式。
 *
 * 这两个名字很形象：饿汉主动找食物吃，懒汉躺在地上等着人喂。
 */
public class Singleton {
    //私有构造函数
    private Singleton(){

    }
    //单例对象
    private volatile static Singleton instance=null;
    public static Singleton getInstance(){
        //双重检测机制：两次判空的机制
        if(instance==null){
            //同步锁
            synchronized (Singleton.class){
                //双重检测机制
                if(instance==null){
                    instance=new Singleton();
                }
            }

        }
        return instance;
    }

}
