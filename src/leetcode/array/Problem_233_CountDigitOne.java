package leetcode.array;

/**
 * @Author nilzxq
 * @Date 2020-09-21 12:51
 */
public class Problem_233_CountDigitOne {
    public int countDigitOne(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            int num=i;
            while(num!=0){
                if(num%10==1){
                    count++;
                }
                num=num/10;
            }
        }
        return count;
    }
}
