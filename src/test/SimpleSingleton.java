package test;

/**
 * @Author nilzxq
 * @Date 2020-09-27 8:51
 */
public class SimpleSingleton {
    private static SimpleSingleton singleInstance=new SimpleSingleton();
    private SimpleSingleton(){

    }
    public static SimpleSingleton getInstance(){
        return singleInstance;
    }
}
