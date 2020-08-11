package leetcode.learningAll;
import java.util.Stack;
/**
* @author nilzxq
* @version 2020年2月2日 下午6:30:58
*类说明
*/
public class Problem_93_Queue_DecodeString {

//oj 错误
//	private static int i=0;
//	public static String decodeString(String s) {
//		return decode(s).toString();
//	}
//
//	private static StringBuilder decode(String s) {
//		StringBuilder result=new StringBuilder();
//		int count=0;
//		while(i<s.length()) {
//			char c=s.charAt(i);
//			i++;
//			if(c>='0'&&c<='9') {
//				count*=10;
//				count+=c-'0';
//			}else if(c=='[') {
//				StringBuilder stringBuilder=decode(s);
//				for(int j=0;j<count;j++) {
//					result.append(stringBuilder);
//				}
//				count=0;
//			}else if(c==']'){
//				return result;
//			}else {
//				result.append(c);
//			}
//		}
//		return result;
//	}
	public static String decodeString(String s) {
		Stack<String> stack = new Stack<>();
      for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (']' == c) {
            StringBuilder stringBuilder = new StringBuilder();
            while(!stack.peek().equals("[")) {
                stringBuilder.insert(0, stack.pop());
            }
            stack.pop();
            Integer times = Integer.valueOf(stack.pop());
            StringBuilder temp = new StringBuilder();
            for (int j = 0; j < times; j++) {
                temp.append(stringBuilder);
            }
            stack.push(temp.toString());
        } else if (c >= '0' && c <= '9'){
            StringBuilder stringBuilder = new StringBuilder();
            while (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                stringBuilder.append(s.charAt(i));
                i++;
            }
            i--;
            stack.push(stringBuilder.toString());
        } else {
            stack.push(s.substring(i, i + 1));
        }
    }
    StringBuilder result = new StringBuilder();
    while (!stack.isEmpty()) {
        result.insert(0, stack.pop());
    }
    return result.toString();
	}


	public static void main(String[] args) {
		String s = "3[a]2[bc]";
		System.out.println(decodeString(s));
	}
}
