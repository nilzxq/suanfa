package test;

/**
 * @Author nilzxq
 * @Date 2020-09-23 18:43
 */
public class ClassB extends ClassA implements A{
    @Override
    void g(){
        System.out.println(max);
    }
    @Override
    public void f(){
        System.out.print(" "+max);
    }
}
