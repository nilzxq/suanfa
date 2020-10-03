package test;

/**
 * @Author nilzxq
 * @Date 2020-09-30 16:23
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println(test(10)+" ");
        System.out.println(test(20));
    }

    public static int test(int b){
        try{
            if(b==20){
                throw new RuntimeException();
            }
            return b+=10;
        }catch (Exception e){
            return 0;
        }finally {
            return b+=10;
        }
    }

}
