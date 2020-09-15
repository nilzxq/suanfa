package interview.wuba;

/**
 * @Author nilzxq
 * @Date 2020-09-15 11:34
 */
public class X5 {
    public static void main(String[] args) {
        int num=37;
        while(num>0){
            System.out.print(num++ %7 +"\t");
            num/=7;
        }
    }
}
