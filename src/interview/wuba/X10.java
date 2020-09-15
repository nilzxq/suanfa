package interview.wuba;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author nilzxq
 * @Date 2020-09-15 13:29
 */
public class X10 {


        public static void main(String args[]) {
            String str = "aba";
            String pattern = "a+(a|ba*)";

            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(str);
            System.out.println(m.matches());
        }


}
