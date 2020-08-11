package leetcode.learningAll;
/**
* @author nilzxq
* @version 2020年5月29日 上午7:50:36
*类说明
*/
public class Problem_String_ReplaceSpace {

	public String replaceSpace(StringBuffer str){
		return str.toString().replaceAll("\\s","%20");
	}

	public String replaceSpace1(StringBuffer str) {
		String str1=str.toString();
		if(str1.equals("")) {
			return str1;
		}
		char[] strArray=str1.toCharArray();
		int i=0;
		int lengthSpace=0;
		while(i<strArray.length) {
			if(strArray[i]==' ') {
				lengthSpace++;
			}
			i++;
		}
		int newStrLength=strArray.length+lengthSpace*2;
		char[] newStr=new char[newStrLength];
		int j=newStrLength-1;
		i=strArray.length-1;
		while(i>=0) {
			if(strArray[i]!=' ') {
				newStr[j--]=strArray[i--];
			}else {
				newStr[j--]='0';
				newStr[j--]='2';
				newStr[j--]='%';
				i--;
			}
		}
		return new String(newStr);
	}

	public static void main(String[] args) {
		Problem_String_ReplaceSpace rs=new Problem_String_ReplaceSpace();
		StringBuffer str=new StringBuffer("We are happy");
		System.out.println(rs.replaceSpace(str));
		System.out.println(rs.replaceSpace1(str));
	}

}
