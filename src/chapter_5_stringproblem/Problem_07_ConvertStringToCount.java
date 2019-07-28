package chapter_5_stringproblem;
/** 
* @author nilzxq
* @version 2019年7月28日 上午8:32:15 
* 类说明 
*/
public class Problem_07_ConvertStringToCount {

	public static String getCountString(String str) {
		if(str==null||str.equals("")) {
			return "";
		}
		char[] chas=str.toCharArray();
		String res=String.valueOf(chas[0]);
		int num=1;
		for(int i=1;i<chas.length;i++) {
			if(chas[i]!=chas[i-1]) {
				res=concat(res,String.valueOf(num), String.valueOf(chas[i]));
				num=1;
			}else {
				num++;
			}
		}
		return concat(res, String.valueOf(num), "");
	}
	
	public  static String concat(String s1,String s2,String s3) {
		return s1+"_"+s2+(s3.equals("")?s3:"_"+s3);
	}
	
	public static char getCharAt(String cstr,int index) {
		if(cstr==null||cstr.equals("")) {
			return 0;
		}
		char[] chs=cstr.toCharArray();
		boolean stage=true;
		char cur=0;
		int num=0;
		int sum=0;
		for(int i=0;i!=chs.length;i++) {
			if(chs[i]=='_') {
				stage=!stage;
			}else if(stage) {
				sum+=num;
				if(sum>index) {
					return cur;
				}
				num=0;
				cur=chs[i];
			}else {
				num=num*10+chs[i]-'0';
			}
		}
		return sum+num>index?cur:0;
	}
	
	public static void main(String[] args) {
		String str = "aaabbadddffc";
		String res = getCountString(str);
		System.out.println(str);
		System.out.println(res);
		System.out.print(getCharAt(res, 9));

	}

}
