package interview.wuba;

/**
 * @Author nilzxq
 * @Date 2020-09-15 11:07
 */
public class xuanze {
    public static void main(String[] args) {
        System.out.println(function(0));
        System.out.println(function(1));
    }

    public static int function(int i){
        try{
            i=i/i-1;
            System.out.println("try\t"+i);
            return i;
        }catch (Exception e){
            System.out.println("catch\t"+(i+1));
            return i+1;
        }finally {
            System.out.println("finally\t"+(i+2));
            return i+2;
        }
    }
}
