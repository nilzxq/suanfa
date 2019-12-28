package leetcode;
/** 
* @author nilzxq
* @version 2019年12月28日 下午4:07:35 
*类说明 
*/
public class Problem_58_String_AddBinary {
// oj测试错误
//	public static String addBinary(String a,String b) {
//		return add1(a,b);
//	}
//	
//	private static String add1(String a,String b) {
//		int i=Integer.parseInt(a,2);
//		int j=Integer.parseInt(b,2);
//		return Integer.toBinaryString(i+j);
//	}
	public static String addBinary(String a,String b) {
		char[] aArray=a.toCharArray();
		char[] bArray=b.toCharArray();
		if(aArray.length>=bArray.length) {
			return addBinary(aArray,bArray);
		}
		return addBinary(bArray,aArray);
	}
	
	public static String addBinary(char[] aArray,char[] bArray) {
		int target=0;
		//a数组的起始位
		int initIndex=aArray.length-bArray.length;
		for(int i=bArray.length-1;i>=0;i--) {
			//两数组，进位标志相加得到的字符
			int temp=(int)aArray[initIndex+i]+(int)bArray[i]+target-(int)'0';
			if(temp>'1') {
				//有进位
				aArray[initIndex+i]=(char)(temp-2);
				target=1;
			}else {
				//无进位
				aArray[initIndex+i]=(char)temp;
				target=0;
			}
		}
		//b数组遍历完成
		//无进位
		if(target==0) {
			return String.valueOf(aArray);
		}
		//进位
		//遍历a数组剩余部分
		for(int i=initIndex-1;i>=0;i--) {
			//进位后不需要再进位
			if(aArray[i]=='0') {
				//改为1
				aArray[i]++;
				return String.valueOf(aArray);
			}
			//改为0
			aArray[i]--;
		}
		//遍历a完成仍有进位
		return "1"+String.valueOf(aArray);
	}
	
	
	public static void main(String[] args) {
		 String a = "1010";
		 String b = "1011";
		 System.out.println(addBinary(a,b));
	}
}
