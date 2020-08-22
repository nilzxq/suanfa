package interview;

import static java.lang.Math.random;

/**
 * 重点理解为什么要用(rand5() - 1) * 5 + rand5()这个式子来计算，以及用这个式子计算的结果能保证概率相等。 (rand5() - 1) * 5 + rand5(): 当第一个rand5() = 1时，可以产生1，2，3，4，5，每个数产生的概率相等。 当第一个rand5() = 2时，可以产生6，7，8，9，10 每个数产生的概率相等。 当第一个rand5() = 3时，可以产生11，12，13，14，15，
 * 每个数产生的概率相等。 当第一个rand5() = 4时，可以产生16，17，18，19，20，每个数产生的概率相等。
 * 当第一个rand5() = 5时，可以产生21，22，23，24，25，每个数产生的概率相等。 第一个rand5()为1，2，3，4，5的概率相等，
 * 所以产生的1到25这25个数概率相等，去掉22，23，24，25，剩下的数产生的概率仍然相等。
 * @Author nilzxq
 * @Date 2020-08-21 20:10
 */
public class wanmeishijie {
    public static int rand5(){
        int n=(int)(Math.random()*5+1);
        return n;
    }

    public static int rand7(){
        int n,temp1,temp2;
        while(true){
            temp1=rand5();
            temp2=rand5();
            //n是可以取1~25的随机的数。
            n=(temp1-1)*5+temp2;
            //当n>21重新生成，即扔掉n>21的数，这样n只能取1~21
            if(n>21){
               continue;
            }else{
                break;
            }
        }
        //对7取模就能取1~7之间的随机数
        return 1+n%7;
    }

    //rand8随机生成器制作一个1-7随机数生成器
    public static int rand8(){
        int n=(int)(Math.random()*8+1);
        return n;
    }

    public static int rand7_1(){
        int n;
       do{
           n=rand8();
       }while(n>7);
       return 1+n%7;
    }

    public static void main(String[] args) {
//        for(int i=0;i<100;i++){
//            System.out.print(rand5()+"\t");
//        }
//        System.out.println();
//        for(int i=0;i<100;i++){
//            System.out.print(rand7()+"\t");
//        }

        int Max=10000000;
        int[] a=new int[7];
        for(int i=0;i<Max;i++){
            switch (rand7()){
                case 1:a[0]++;break;
                case 2:a[1]++;break;
                case 3:a[2]++;break;
                case 4:a[3]++;break;
                case 5:a[4]++;break;
                case 6:a[5]++;break;
                case 7:a[6]++;break;
            }
        }

        for(int i=0;i<7;i++){
            System.out.print((double)(a[i])/Max*100+" ");
        }


    }
}
