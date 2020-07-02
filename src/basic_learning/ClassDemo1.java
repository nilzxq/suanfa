package basic_learning;

/**
 * 反射
 * @Author nilzxq
 * @Date 2020-07-02 7:50
 */
public class ClassDemo1 {
    public static void main(String[] args) {

        //Foo的实例对象如何表示
        Foo foo1 = new Foo();//foo1就表示出来了
        //Foo这个类，也是一个实例对象，Class类的实例对象，如何表示呢、
        //任何一个类都是Class的实例对象，这个实例对象那个有三个表示方式
        //第一种表示方式--》实际在告诉我们任何一个类都有一个隐含的静态成员变量class
        // 1. 通过类名.class获取Class对象
        Class class1 = Foo.class;

        //第二种表示方式  已经知道该类的对象通过getClass方法
        //2.通过对象.getClass()方法获取Class对象
        Class class2 = foo1.getClass();

        /*
         * 官网class1 ,class2表示了Foo类的类类型(class type)
         * 万事万物 都是对象
         * 类也是对象，是Class类的实例对象
         * 这个对象我们称为该类的类类型
         */
        //不管class1  or class2都代表了Foo类的类类型，一个类只可能是Class；类的一个实例对象
        System.out.println(class1==class2);//true'

        //System.out.println(class1);

        //第三种表达方式
        //通过Class.forname(“全限定类名”)
        //类的名称：全限定名称
        //需要捕获异常
        Class class3 = null;
        try {
            class3 = Class.forName("basic_learning.Foo");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //
        System.out.println(class2==class3);//true

        //通过Class对象的方法newInstance获取实例化对象（通过反射来创建对象）前提：类型中必须有默认的构造方法。--》通过class1  or class2 or class3
        //创建Foo类的实例对象
        try {
            //需要有无参数的构造方法
            Foo foo = (Foo) class1.newInstance();//需要强转
            foo.print();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
//
class Foo{
    public void print(){
        System.out.println("foo");
    }
}

