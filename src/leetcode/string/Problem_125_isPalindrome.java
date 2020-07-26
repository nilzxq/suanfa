package leetcode.string;

/**
 * @Author nilzxq
 * @Date 2020-07-26 17:00
 */
public class Problem_125_isPalindrome {
    public static void main(String[] args) {

        String s="A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
        //System.out.println(('A'-'a'));
    }
    public static boolean isPalindrome(String s){
        if(s==" "){
            return true;
        }
        //s=s.toLowerCase();
        char[] cha=s.toCharArray();
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=0;i<cha.length;i++){
            //A与a差32 不能直接用>='A' 小于 'z'来划分包括大小写字母 他们中间还有其它字符
            if((cha[i]>='a'&&cha[i]<='z')||(cha[i]>='0'&&cha[i]<='9')||(cha[i]>='A'&&cha[i]<='Z')){
                stringBuilder.append(cha[i]);
            }
        }
        int n=stringBuilder.length();
        for(int i=0;i<n;i++){
            if(Character.toLowerCase(stringBuilder.charAt(i))!=Character.toLowerCase(stringBuilder.charAt(n-i-1))){
                return false;
            }
        }
        return true;
    }
}
