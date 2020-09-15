package interview.wuba;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @Author nilzxq
 * @Date 2020-09-15 13:31
 */
public class X11 {
    public static void main(String[] args) {
        A a=new A(1);
        a.run();//第一处
        new Thread(a).start();
        a.run();//第二处
        ArrayList<Integer> arr=new ArrayList<>();
        arr.size();
        LinkedList<Integer> list=new LinkedList<>();
        list.size();
    }
}
class A implements Runnable{
    private int i;
    public A(int i){
        this.i=i;
    }
    @Override
    public void run(){
        sleep();
        i++;
        System.out.println(i);
    }
    public void sleep(){
        try{
            Thread.sleep(5000);

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
