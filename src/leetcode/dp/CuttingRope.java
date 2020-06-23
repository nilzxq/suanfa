package leetcode.dp;

/**
 * 贪心
 * 循环结束的结果分为三种：
 * 1.n=2，等于说无限除以3，最后余下绳子长度为2，此时将res乘以2即可
 * 2.n=3，绳子全部用完，直接所有3相乘即可
 * 3.n=4，等于说余下绳子长度为1，因为4%3=1，但是3<2*2，也就是4本身，故最后乘4
 *
 * 作者：CharlesGao
 * 链接：https://leetcode-cn.com/problems/jian-sheng-zi-ii-lcof/solution/jian-sheng-zi-ii-shu-xue-fa-miao-jie-by-charlesgao/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * @Author nilzxq
 * @Date 2020-06-23 22:58
 */
public class CuttingRope {
    public static int cuttingRope(int n){
        if(n<=3) return n-1;
        long res=1;
        while(n>4){
            res*=3;
            res=res%1000000007;
            n-=3;
        }
        return (int)(res*n%1000000007);
    }

    public static void main(String[] args) {
        System.out.println(cuttingRope(10));
    }
}
