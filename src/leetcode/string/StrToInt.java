package leetcode.string;

/**
 * @Author nilzxq
 * @Date 2020-07-08 22:28
 */
public class StrToInt {

    public static int strToInt(String str){
        char[] charArray=str.trim().toCharArray();
        if(charArray.length==0) {
            return 0;
        }
        int i=1,sign=1;
        int res=0,boundary=Integer.MAX_VALUE/10;

        if(charArray[0]=='-') {
            sign=-1;
        } else if(charArray[0]!='+') {
            i=0;
        }
        for(int j=i;j<charArray.length;j++){
            if(charArray[j]<'0'||charArray[j]>'9') {
                break;
            }
            if(res>boundary||res==boundary&&(charArray[j]>'7')) {
                return sign==1?Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            res=res*10+(charArray[j]-'0');
        }
        return sign*res;
    }

    public static void main(String[] args) {
        String str=" -90243 hello";
        System.out.println(strToInt(str));
    }
}
