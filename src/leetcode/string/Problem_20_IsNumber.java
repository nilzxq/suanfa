package leetcode.string;

/**
 * @Author nilzxq
 * @Date 2020-09-10 19:47
 */
public class Problem_20_IsNumber {
    public boolean isNumber(String s){
        if(s==null||s.length()==0){
            return false;
        }
        //s为空对象或s长度为0（空字符串）时，不能表示数值
        boolean isNum=false,isDot=false,ise_or_E=false;
        char[] str=s.trim().toCharArray();
        for(int i=0;i<str.length;i++){
            if(str[i]>='0'&&str[i]<='9'){
                //判断当前字符是否为0~9的数位
                isNum=true;
                //遇见小数点
            }else if(str[i]=='.'){
                //小数点之前可以没有整数，但是不能重复出现小数点，或者‘e’、‘E’
                if(isDot||ise_or_E){
                    return false;
                }
                isDot=true;
            }else if(str[i]=='e'||str[i]=='E'){
                if(!isNum||ise_or_E){
                    return false;
                }
                ise_or_E=true;
                isNum=false;
            }else if(str[i]=='-'||str[i]=='+'){
                //正负号只可能出现在第一个位置，或者出现在‘e’或'E'的后面一个位置
                if(i!=0&&str[i-1]!='e'&&str[i-1]!='E'){
                    return false;
                }
            }else{
                // 其它情况均为不合法字符
                return false;
            }
        }
        return isNum;
    }
}
