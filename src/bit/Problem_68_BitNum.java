package bit;

/**
 * @Author nilzxq
 * @Date 2020-08-08 20:02
 */
public class Problem_68_BitNum {
    public static void main(String[] args) {
        //System.out.println(solution(5,10));
        System.out.println(solution1(5,10));
    }
    public static int solution(int l,int r){
        int m=0;//计数器
        int max=0;
        int res=0;
        for(int i=l;i<=r;i++){
            String num=Integer.toBinaryString(i);
            char[] cha=num.toCharArray();
            for(int j=0;j<cha.length;j++){
                if(cha[j]=='1'){
                    m++;
                }
            }
            if(m>=max){
                max=Math.max(m,max);
                res=i;
            }
            m=0;
        }
        return res;
    }
    public static int solution1(int l,int r){
        int sum=0;
        int res=0;
        int b;
        for(int i=l;i<=r;i++){
            int tmp=0;
            int a=i;
            while(a!=0){
                b=a%2;
                if(b==1){
                    tmp++;
                }
                a=a/2;
            }
            if(tmp>=sum){
                sum=tmp;
                res=i;
            }
        }
        return res;
    }
}
