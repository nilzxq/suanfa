package interview.huawei;

/**
 * @Author nilzxq
 * @Date 2020-10-14 16:42
 */
public class MultAccunt {
    public static int multiAccunt(int oldAcc,int newVal,int scale){
        return oldAcc+(newVal*scale);
    }

    public static void main(String[] args) {
        int newVal=Integer.MIN_VALUE;
        System.out.println(newVal);
        int oldVal=Integer.MIN_VALUE;
        System.out.println(oldVal);
        System.out.println(multiAccunt(oldVal,newVal,0));

    }

    public static int getAbsAdd(int x,int y){
        assert x!=Integer.MIN_VALUE;
        assert y!=Integer.MIN_VALUE;
        int absX=Math.abs(x);
        int absY=Math.abs(y);
        assert(absX<=(Integer.MAX_VALUE-absY));
        return absX+absY;
    }
}
