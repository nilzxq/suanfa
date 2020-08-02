//package interview;
//
//import java.util.Scanner;
//
///**
// * @Author nilzxq
// * @Date 2020-08-02 19:11
// */
//public class pinduoduo {
//
//    /**
//     * 5 1 9
//     * 9 1
//     * 4 9
//     * 3 1
//     * 2 3
//     * 6 5
//     * 9 8
//     * @param args
//     */
//        public static void main(String[] args) {
//            Scanner in = new Scanner(System.in);
//            int K = in.nextInt();
//            int N = in.nextInt();
//            int[] arr=new int[N];
//            int sum=0;
//            for(int i=0;i<N;i++){
//                arr[i]=in.nextInt();
//                sum+=arr[i];
//            }
//            if(sum%K==0){
//
//            }
//
////            int maxz=Integer.MIN_VALUE;
////            int maxw=Integer.MIN_VALUE;
////            int N=in.nextInt();
////            int M=in.nextInt();
////            int T=in.nextInt();
////            int[][] z=new int[N][2];
////            int[][] w=new int[M][2];
////            for(int i=0;i<N;i++){
////                z[i][0]=in.nextInt();
////                z[i][1]=in.nextInt();
////                if(z[i][1]>maxz){
////                    maxz=z[i][1];
////                }
////            }
////
////            in.nextLine();
////            for(int i=0;i<M;i++){
////                w[i][0]=in.nextInt();
////                w[i][1]=in.nextInt();
////                if(w[i][1]>maxw){
////                    maxw=w[i][1];
////                }
////            }
////            System.out.println(z[0][0]);
////            System.out.println(z[0][1]);
////            System.out.println(w[0][0]);
////            System.out.println(w[0][1]);
////            System.out.println(maxz);
////            System.out.println(maxw);
////            in.nextLine();
////            System.out.print(helper3(z,w,T,maxz,maxw));
//        }
//
//        public static int[] helper(int[] nums,int index,int K){
//        int sum=0;
//        int[] res=new int[2];
//        boolean huisu=false;
//        int start=0;
//        for(int i=0;i<nums.length;i++){
//            if(K-nums[i]>0){
//                K-=nums[i];
//                if(K==0){
//                    System.out.println("paradox");
//                    break;
//                }
//                if(K>0&&i==nums.length){
//                    res[0]=K;
//                    res[1]=0;
//                    break;
//                }
//            }
//            if(K-nums[i]<0&&K-nums[i-1]>0){
//                huisu=true;
//                start=i;
//                break;
//            }
//        }
//
//    }
//
//    /**
//     * 超时
//     * @param zhongcan
//     * @param wancan
//     * @param yummy
//     * @param maxz
//     * @param maxw
//     * @return
//     */
//    public static int helper3(int[][] zhongcan,int[][] wancan,int yummy,int maxz,int maxw){
//        if(yummy==0){
//            return 0;
//        }
//        if(yummy>(maxw+maxz)) {
//            return -1;
//        }
//            int min=Integer.MAX_VALUE;
//            for(int i=0;i<zhongcan.length;i++){
//                for(int j=0;j<wancan.length;j++){
//                    if(zhongcan[i][1]+wancan[j][1]>=yummy){
//                        min=Math.min(zhongcan[i][0]+wancan[j][0],min);
//                        System.out.println("1 "+min);
//                    }
//                    if(zhongcan[i][1]>=yummy) {
//                        min=Math.min(min,zhongcan[i][0]);
//                        System.out.println("2 "+min);
//                    }
//                    if(wancan[j][1]>=yummy) {
//                        min=Math.min(min,wancan[i][0]);
//                        System.out.println("3 "+min);
//                    }
//                    }
//                }
//        System.out.println("4 "+min);
//        return min;
//    }
//
//}
