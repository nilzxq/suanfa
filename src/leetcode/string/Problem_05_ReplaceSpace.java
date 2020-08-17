package leetcode.string;


import org.junit.Test;

/**
 * @Author nilzxq
 * @Date 2020-08-17 19:07
 */
public class Problem_05_ReplaceSpace {
    @Test
    public String replaceSpace(String s){
        StringBuilder sb=new StringBuilder();
        for(Character c:s.toCharArray()){
            if(c==' '){
                sb.append("%20");
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
