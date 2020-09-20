//package interview.shangtang;
//
///**
// * @Author nilzxq
// * @Date 2020-09-18 19:39
// */
//import java.util.*;
//
////"X"表示墙壁 "."表示道路 大写字母"A"表示门 小写字母"a"表示钥匙 钥匙和门"A B C D E"
////S 起点 G终端
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
//           int n=sc.nextInt();//行
//           int m=sc.nextInt();//列
//            sc.nextLine();
//            char[][] grid=new char[n][m];
//            for(int i=0;i<n;i++){
//                String str=sc.nextLine();
//                for(int j=0;j<m;j++){
//                    grid[i][j]=str.charAt(j);
//                }
//            }
//            System.out.println("YES");
//        }
//    }
//
//    public static boolean dfs(char[][] grid,int n,int m){
//        HashSet<ArrayList<Integer>> visitd=new HashSet<>();
//        Queue<ArrayList<Integer>> queue=new LinkedList<>();
//        Queue<Integer> dis=new LinkedList<>();
//        int start=0,end=0;
//        int k=-1;
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                if(grid[i][j]=='S'){
//                    start=i*m+j;
//                }else if(grid[i][j]=='G'){
//                    end=i*m+j;
//                }else if(grid[i][j]<='E'&&grid[i][j]>='a'){
//                    k++;
//                }
//            }
//        }
//        ArrayList<Integer> arr=new ArrayList<>();
//        arr.add(start);
//        arr.add(1<<(k+1));
//        arr.add(end);
//        arr.add(1<<(k+1));
//    }
//}
