package leetcode.string;

/**
 * @Author nilzxq
 * @Date 2020-08-17 18:20
 */
public class Problem_58_ReverseLeftWords {
    public String reverseLeftWords(String s,int n){
        return s.substring(n,s.length())+s.substring(0,n);
    }

    public String reverseLeftWords1(String s,int n){
        StringBuilder sb=new StringBuilder();
        for(int i=n;i<s.length();i++){
            sb.append(s.charAt(i));
        }
        for(int i=0;i<n;i++){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
