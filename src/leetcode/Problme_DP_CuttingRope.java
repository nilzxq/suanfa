package leetcode;

/**
 * @Author nilzxq
 * @Date 2020-06-20 8:07
 */
public class Problme_DP_CuttingRope {

    public static int cuttingRope(int n){
        if(n<2){
            return 0;
        }
        if(n==2){
            return 1;
        }
        if(n==3){
            return 2;
        }
        /*********下面考虑的是，剩下绳长的最大乘积***********/
        //当剩下的绳长分别是0/1/2的时候，最大乘积就是本身的长度，不需要再去剪,没因为一刀没有不剪的乘积大
        int[] product=new int[n+1];
        product[0]=0;
        product[1]=1;
        product[2]=2;
        product[3]=3;

        for(int i=4;i<=n;i++){
            //每次将最大乘积清空
            int max=0;
            for(int j=1;j<=i/2;j++){
                int products=product[j]*product[i-j];
                if(max<products){
                    max=products;
                }
            }
            product[i]=max;
        }
        return product[n];
    }


    public static void main(String[] args) {
        System.out.println(cuttingRope(10));
    }
}
