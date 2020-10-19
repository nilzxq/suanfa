//package leetcode.topK;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.PriorityQueue;
//
///**
// * @Author nilzxq
// * @Date 2020-09-16 19:32
// */
//public class Problem_347_TopKFrequent {
//    public int[] topkFrequent(int[] nums,int k){
//        Map<Integer,Integer> freq=new HashMap<>();
//        for(int i=0;i<nums.length;i++){
//            int f=freq.getOrDefault(nums[i],0)+1;
//            freq.put(nums[i],f);
//        }
//        PriorityQueue<Integer> minHeap=new PriorityQueue<>((o1,o2)->Integer.compare(freq.get(o1),freq.get(o2)));
//        for(Integer elem:freq.keySet()){
//            minHeap.add(elem);
//            if(minHeap.size()>k){
//                minHeap.remove();
//            }
//        }
//
////        int[] res=new int[minHeap.size()];
//        for(int i=0;i<res.length;i++){
//            res[i]=minHeap.remove();
//        }
//        return res;
//    }
//
//    public static String[][] topKstrings (String[] strings, int k) {
//        // write code here
//        Map<String,Integer> map=new HashMap<>();
//        Map<Integer,Integer> map1=new HashMap<>();
//
//        for(int i=0;i<strings.length;i++){
//            int f=map.getOrDefault(strings[i],0)+1;
//            map.put(strings[i],f);
//        }
//
//        PriorityQueue<Integer minHeap=new PriorityQueue<>((o1,o2)->
//                Integer.compare(map.get(o1)-map.get(o2)));
//        for(String elem:map.keySet()){
//            minHeap.add(elem);
//            if(minHeap.size()>k){
//                minHeap.remove();
//            }
//        }
//
//
//        String[][] result=new String[minHeap.size()][];
//        for(int i=0;i<minHeap.size();i++){
//            for(int j=0;i<minHeap.size();j++){
//                result[i][0]=minHeap.remove();
//                result[i][1]=map.get(i)+"";
//            }
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//        String[] str={"1","2","3","4"};
//        topKstrings(str,2).toString();
//    }
//}
