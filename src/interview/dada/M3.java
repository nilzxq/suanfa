package interview.dada;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 6,5,4,3,2,1
 * 2
 * 7
 * @Author nilzxq
 * @Date 2020-09-20 15:58
 */
public class M3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str.replace(","," ");
        String[] strs=str.split(",");
        int[] task=new int[strs.length];
        for(int i=0;i<task.length;i++){
            task[i]=Integer.valueOf(strs[i]);
            //System.out.println(task[i]);
        }
        int days=sc.nextInt();
        System.out.println(splitArray(task,days));
    }

    public static int splitArray(int[] nums, int m) {
        int n = nums.length;
        int[][] f = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(f[i], Integer.MAX_VALUE);
        }
        int[] sub = new int[n + 1];
        for (int i = 0; i < n; i++) {
            sub[i + 1] = sub[i] + nums[i];
        }
        f[0][0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= Math.min(i, m); j++) {
                for (int k = 0; k < i; k++) {
                    f[i][j] = Math.min(f[i][j], Math.max(f[k][j - 1], sub[i] - sub[k]));
                }
            }
        }
        return f[n][m];
    }

}
