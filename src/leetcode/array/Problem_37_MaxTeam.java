package leetcode.array;

/**
 * @Author nilzxq
 * @Date 2020-08-07 15:55
 */
public class Problem_37_MaxTeam {
    public static int solution(int n,int[] a){
        int maxV=0;
        for(int arr:a){
            if(arr>maxV){
                maxV=arr;
            }
        }
        System.out.println(maxV);
        for(int i=0;i<n;i++){
            if(a[i]==maxV){
                a[i]=1;
            }else{
                a[i]=0;
            }
        }
        for(int arr:a){
            System.out.print(arr+" ");
        }
        int max=0;
        int temp=0;
        for(int arr:a){
            if(arr!=1){
                temp=0;
            }else{
                temp++;
            }
            max=Math.max(temp,max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a={1,1,1,0,1,2,2};
        System.out.println(solution(7,a));
    }
}
