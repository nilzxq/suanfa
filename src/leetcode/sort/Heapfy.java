package leetcode.sort;

/**
 * @Author nilzxq
 * @Date 2020-07-28 14:33
 */
public class Heapfy {
    public static void main(String[] args) {
        float f0 = 0.021f;
        float f1 = 0.022f;
        System.out.println(f0);
        System.out.println(f1);
        System.out.println(f0 + f1);

    }
    public void heapfy(int[] arr,int root,int length){
        if(root>length){
            return;
        }
        int left=root*2+1,right=root*2+2;
        int max=arr[root];
    }
}


