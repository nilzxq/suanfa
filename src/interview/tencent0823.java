package interview;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @Author nilzxq
 * @Date 2020-08-23 20:02
 */
public class tencent0823 {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int k=sc.nextInt();
//        int[] arr=new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        HashMap<Integer,Integer> map=new HashMap<>();
//        for(int i=0;i<n;i++){
//            if(i!=k){
//                map.put(i,arr[i]);
//            }
//        }
//        int[] res=new int[map.size()];
//        for(int i=0;i<map.size()-1;i++){
//            res[i]=map.get(i);
//            System.out.print(res[i]+" ");
//        }
//        System.out.println(map.get(map.size()-1));
//        System.out.println(helper3(35));
//        Scanner sc=new Scanner(System.in);
//         int t=sc.nextInt();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(helper5(s,a,b));
        }

    }

    //删除指定位置的节点
    public int[] helper(int[] arr,int n,int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(i!=k){
                map.put(i,arr[i]);
            }
        }
        int[] res=new int[map.size()];
        for(int i=0;i<map.size();i++){
            res[i]=map.get(i);
        }
        return res;
    }

    public class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public void print(ListNode node){
        ListNode temp=node;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
    public ListNode helper1(String str){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        ListNode node=new ListNode(sc.nextInt());
        ListNode temp=node;
        for(int i=1;i<n;i++){
            node.next=new ListNode(sc.nextInt());
            node=node.next;
        }
        int count=0;
        ListNode temp2=temp;
        while(temp!=null){
            if(count==k-1){
                ListNode t=temp.next;
                temp.next=t.next;
            }else{
                temp=temp.next;
            }
            count++;
        }
        return temp2;
    }

    //dp
    public static int helper3(int n){
        //两部分
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=1;i<n;i++){
            for(int j=1;j<=n-i;j++){
                if(i+j==n){
                    sum=sum(i)+sum(j);
                }
                if(sum>max){
                    max=sum;
                }
            }
        }
        return max;
    }

    public static int sum(int n){
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }

    public static int helper5(String str,int l,int r){
        if(l==r){
            return 1;
        }
        String s=str.substring(l-1,r);
        //System.out.println(s);
        int count=0;
        for(int i=l;i<r;i++){
            if(huiwen(s.substring(l-1,i))&&huiwen(s.substring(i,r))){
                count+=2;
                break;
            }
            if(huiwen(s.substring(l-1,i))){
             count++;
             break;
            }
            if(huiwen(s.substring(i,r))){
                count++;
                break;
            }
        }
        return count;
    }

    public static boolean huiwen(String str){
        char[] ch=str.toCharArray();
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(ch[left]!=ch[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
