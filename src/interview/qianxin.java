package interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author nilzxq
 * @Date 2020-08-16 15:20
 */
public class qianxin {
    /**
     *凑硬币
     * @param num_money int整型 奖金的总数,单位为元
     * @return int整型
     */
    public static  int CalulateMethodCount (int num_money) {

        if(num_money<=2){
            return num_money;
        }
        if(num_money==3){
            return 4;
        }
        // write code here
        int[] dp=new int[num_money+1];
        for(int i=4;i<=num_money;i++){
            dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
        }
        return dp[num_money];
    }

    public static int coins4(int[] arr,int aim){
        if(arr==null||arr.length==0||aim<0){
            return 0;
        }
        int[] dp=new int[aim+1];
        for(int i=0;arr[0]*i<=aim;i++){
            dp[arr[0]*i]=1;
        }
        for(int i=1;i<arr.length;i++){
            for(int j=1;j<=aim;j++){
                // dp[j]=dp[j]+dp[j-arr[i]];
                dp[j]+=j-arr[i]>=0?dp[j-arr[i]]:0;
            }
        }
        return dp[aim];
    }

    public static String helper(String s){
        if(s==null){
            return null;
        }
        //字符串数组
        String[] str=s.split(" ");
        //System.out.println(str.length+str[0]+str[1]);
        String[] res= new String[str.length];
        String temp="NULL";
        int p=0;
        for(int i=0;i<str.length;i++){
            //String temp=str[i];
            res[i]=str[i];
            if(str[i].equals("undo")){
                if(i>0){
                    res[i-1]="NULL";
                    temp=str[i-1];
                    p=i-1;
                }

                res[i]="NULL";

            }
            if(str[i].equals("redo")){
                if(!temp.equals("NULL")){
                    res[p]=temp;
                }
                res[i]="NULL";
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<res.length;i++){
            if(!res[i].equals("NULL")&&i!=res.length-1){
                sb.append(res[i]+" ");
            }
        }
        if(!res[res.length-1].equals("NULL")){
            sb.append(res[res.length-1]);
            return sb.toString();
        }
        return sb.toString();

    }

    public static void helper2(String s) throws IOException {
        //String类型中自带.split方法，使用.split("\t")可以以TAB进行切分字符串
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String[] strs=br.readLine().trim().split(" +");
        ArrayList<String> res=new ArrayList<>();
        ArrayList<String> temp=new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            if(strs.equals("undo")){
                String rest=res.remove(res.size()-1);
                temp.add(rest);
            }else if(strs[i].equals("redo")){
                String tempt=temp.remove(temp.size()-1);
                res.add(tempt);
            }else{
                res.add(strs[i]);
            }

        }
        for(int i=0;i<res.size();i++){
            if(i==res.size()-1){
                System.out.println(res.get(i));
            }else{
                System.out.println(res.get(i)+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(helper(s));
    }

}
