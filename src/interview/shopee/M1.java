package interview.shopee;

import java.util.*;

/**
 * @Author nilzxq
 * @Date 2020-09-16 15:08
 */
public class M1 {
    public static class Node{
        public String str;
        public int times;

        public Node(String str, int times) {
            this.str = str;
            this.times = times;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        String[] str=new String[n];
        for(int i=0;i<n;i++){
            str[i]=sc.next();
        }
        helper(str,2);
//        String str=sc.nextLine();
//
//        str.replace(',',' ');
//        str.replace('!',' ');
//        str.replace('\'',' ');
//        str.replace('.',' ');
//        if(str==null||str.length()==0){
//            System.out.println("null");
//            return;
//        }
//        String temp=str.toLowerCase();
//        String[] arr=temp.split("\\s+");
//        Map<String,Integer> words=new HashMap<>();
//
//        for(String s:arr){
//            if(!words.containsKey(s)){
//                words.put(s,1);
//
//            }else{
//                int count=words.get(s);
//                count++;
//                words.put(s,count);
//            }
//        }
//
//        int first=Integer.MIN_VALUE;
//        int second=Integer.MIN_VALUE;
//        Iterator<Map.Entry<String,Integer>> mapEntryInteger=words.entrySet().iterator();
//        while (mapEntryInteger.hasNext()){
//            Map.Entry<String,Integer> entry=mapEntryInteger.next();
//            int v=entry.getValue();
//            if(v>first){
//                second=first;
//                first=v;
//            }else if(v>second&&v!=first){
//                second=v;
//            }
//        }
//        mapEntryInteger=words.entrySet().iterator();
//        while(mapEntryInteger.hasNext()){
//            Map.Entry<String,Integer> entry=mapEntryInteger.next();
//            int v=entry.getValue();
//            if(v==second){
//                System.out.println(entry.getKey());
//            }
//        }
//        System.out.println("null");
    }

    public static void helper(String[] arr,int topK){
        if(arr==null||topK<1){
            return;
        }
        Map<String,Integer> words=new HashMap<>();
        for(int i=0;i!=arr.length;i++){
            String cur=arr[i];
            if(!words.containsKey(cur)){
                words.put(cur,1);
            }else{
                words.put(cur,words.get(cur)+1);
            }
        }
        Node[] heap=new Node[topK];
        int index=0;
        for(Map.Entry<String,Integer> entry:words.entrySet()){
            String str=entry.getKey();
            int times=entry.getValue();
            Node node=new Node(str,times);
            if(index!=topK){
                heap[index]=node;
                insert(heap,index++);
            }else{
                if(heap[0].times<node.times){
                    heap[0]=node;
                    heapify(heap,0,topK);
                }
            }
        }
        //把小根堆的所有元素按词频从大到小排序
        for(int i=index-1;i!=0;i--){
            swap(heap,0,i);
            heapify(heap,0,i);
        }
        //严格按照排名打印k条记录
        for(int i=0;i!=heap.length;i++){
            if(heap[i]==null){
                break;
            }else{
                System.out.print("No."+(i+1)+":");
                System.out.print(heap[i].str+",times:");
                System.out.println(heap[i].times);
            }
        }
    }

    private static void insert(Node[] heap, int i) {
        while(i!=0){
            int parent=(i-1)/2;
            if(heap[i].times<heap[parent].times){
                swap(heap,parent,i);
                i=parent;
            }else{
                break;
            }
        }
    }

    public static void heapify(Node[] heap,int index,int heapSize){
        int left=index*2+1;
        int right=index*2+2;
        int smallest=index;
        while(left<heapSize){
            if(heap[left].times<heap[index].times){
                smallest=left;
            }
            if(right<heapSize&&heap[right].times<heap[smallest].times){
                smallest=right;
            }else{
                break;
            }
            index=smallest;
            left=index*2+1;
            right=index*2+1;
        }
    }

    public static void swap(Node[] heap,int index1,int index2){
        Node temp=heap[index1];
        heap[index1]=heap[index2];
        heap[index2]=temp;
    }
}
