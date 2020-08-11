package leetcode.learningAll;
/**
* @author nilzxq
* @version 2020年1月3日 下午5:28:31
*类说明
*/
public class Problem_64_Array_ReverseWords {

	 public static String reverseWords(String s) {
	      if(s==null||s.length()==0) {
	    	  return "";
	      }
	      final char[] c=s.toCharArray();
	      final int len=c.length;
	      int i=len-1;
	      while(i>=0&&c[i]==' ') i--;//注意为什么用while 而不是if 因为可能有连续的空格
	      int left=i+1;
	      int right=i+1;
	      StringBuffer sb=new StringBuffer(i+1);

	      for(;i>=0;i--) {
	    	  if(c[i]==' ') {
	    		  //append(数组，起始位置，长度)
	    		  if(right!=left) sb.append(c,left,right-left).append(" ");
	    		  left=i;
	    		  right=i;
	    		  continue;
	    	  }
	    	  left=i;
	      }
	      if(right!=left) {
	    	  return sb.append(c,left,right-left).toString();
	      }
	      return sb.length()>0?sb.substring(0,sb.length()-1):"";
	 }

	 public static void main(String[] args) {
		String s1="the sky is blue";
		String s2="  hello world!  ";
		String s3="a good   example";
		System.out.println(reverseWords(s1));
		System.out.println(reverseWords(s2));
		System.out.println(reverseWords(s3));
	}
}
