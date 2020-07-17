package leetcode.string;

/**
 * 输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。为简单起见，标点符号和
 * 普通字母一样处理。例如输入字符串"I am a student. "，则输出"student. a am I"。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/fan-zhuan-dan-ci-shun-xu-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author nilzxq
 * @Date 2020-07-13 7:12
 */

public class Problem_58_String_ReverseWords {
    /**
     * 双指针
     * @param s
     * @return
     */
    public String reverseWords(String s){
        s=s.trim();
        int i=s.length()-1,j=i;
        StringBuilder res=new StringBuilder();
        while(i>=0){
            while(i>=0&&s.charAt(i)!=' ') i--;
            res.append(s.substring(i+1,j+1)+" ");
            while(i>=0&&s.charAt(i)==' ')i--;
            j=i;
        }
        return res.toString().trim();
    }

    /**
     *
     * @param s
     * @return
     */
    public String reverseWords1(String s){

        return "";
    }
    public static void main(String[] args) {
        Problem_58_String_ReverseWords reverseWords=new Problem_58_String_ReverseWords();
        System.out.println(reverseWords.reverseWords("hello the wewf    "));
    }
}
