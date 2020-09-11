package interview.youzan;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author nilzxq
 * @Date 2020-09-11 15:24
 */
public class M1 {
    public static void main(String[] args) {
//        System.out.println();
//        Integer f1=100,f2=100,f3=150,f4=150;
//        System.out.println(f1==f2);
//        System.out.println(f3==f4);
        Set<Short> s=new HashSet<>();
        for(Short i=0;i<100;i++){
            s.add(i);
            if(s.contains(i-1)){
                System.out.println(s.remove(i-1));
            }

        }
        System.out.println(s.size());
        //打印s
        System.out.println(s);
    }

}
