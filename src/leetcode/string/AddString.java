package leetcode.string;



/**
 * 用字符串模拟两个大数相加
 * @Author nilzxq
 * @Date 2020-10-13 9:55
 */
public class AddString {
    public static String add(String a,String b){
        StringBuilder res=new StringBuilder();

        //反转字符串
        String stra=new StringBuilder(a).reverse().toString();
        String strb=new StringBuilder(b).reverse().toString();

        int lena=stra.length();
        int lenb=strb.length();
        int maxLen=lena>lenb?lena:lenb;
        //是否越界
        boolean over=false;
        //溢出数量
        int num=0;

        //把两个字符串补齐
        if(lena<lenb){
            for(int i=lena;i<lenb;i++){
                stra+="0";
            }
        }else{
            for(int i=lenb;i<lena;i++){
                strb+="0";
            }
        }

        //把两个正整数相加，一位一位的加，并加上进位
        for(int i=0;i<maxLen;i++){
            int sum=Integer.parseInt(stra.charAt(i)+"")+Integer.parseInt(strb.charAt(i)+"");
            //加上前一位的进位
            sum=sum+num;

            if(sum>=10){
                //已经计算到最后一位了
                if(i==maxLen-1){
                    over=true;
                }
                //溢出了
                num=1;
                res.append(sum-10);
            }else{
                //没溢出
                num=0;
                res.append(sum);
            }
        }

        //如果溢出的话，表示位增加了
        if(over){
            res.append(num);
        }
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        String n1 = "999999999";
        String n2 = "999999999";
        System.out.println(add(n1, n2));
    }
}
