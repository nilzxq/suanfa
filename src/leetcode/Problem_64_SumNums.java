package leetcode;

/**
 * @Author nilzxq
 * @Date 2020-06-15 23:34
 */
public class Problem_64_SumNums {

    //https://leetcode-cn.com/problems/qiu-12n-lcof/solution/mian-shi-ti-64-qiu-1-2-nluo-ji-fu-duan-lu-qing-xi-/
    public int sumNums(int n) {

        boolean x=n>1&&(n+=sumNums(n-1))>0;
        return n;
    }

    public static void main(String[] args) {
        Problem_64_SumNums sumNums=new Problem_64_SumNums();
        System.out.println(sumNums.sumNums(9));
    }
}
