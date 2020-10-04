package interview.lock;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @Author nilzxq
 * @Date 2020-10-03 20:47
 */
public class DeadLock {
    private final Object left=new Object();
    private final Object right=new Object();

    public void leftToRight(){
        synchronized (left){
            try {
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            synchronized (right){
                System.out.println("得到right");
            }
        }
    }

    public void rightToLeft(){
        synchronized (right){
            try {
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            synchronized (left){
                System.out.println("得到left");
            }
        }
    }

    public static void main(String[] args) {
        DeadLock deadLock=new DeadLock();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    deadLock.leftToRight();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    deadLock.rightToLeft();
                }
            }
        }).start();
    }
}
