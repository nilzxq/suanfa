package interview.lock;

/**
 * @Author nilzxq
 * @Date 2020-10-10 14:02
 */
public class DeadLock1 {
    private final Object left=new Object();
    private final Object right=new Object();
    public void leftToRight(){
        synchronized (left){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
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
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (left){
                System.out.println("得到left");
            }
        }
    }

    public static void main(String[] args) {
        DeadLock1 deadLock=new DeadLock1();
        //重写runnable
        new Thread(new Runnable() {
            @Override
            public void run() {
                deadLock.leftToRight();
            }
        }
        ).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                deadLock.rightToLeft();
            }
        }).start();

    }
}
