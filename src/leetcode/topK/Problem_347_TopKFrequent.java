package leetcode.topK;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @Author nilzxq
 * @Date 2020-09-16 19:32
 */
public class Problem_347_TopKFrequent {
    public int[] topkFrequent(int[] nums,int k){
        Map<Integer,Integer> freq=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int f=freq.getOrDefault(nums[i],0)+1;
            freq.put(nums[i],f);
        }
        PriorityQueue<Integer> minHeap=new PriorityQueue<>((o1,o2)->Integer.compare(freq.get(o1),freq.get(o2)));
        for(Integer elem:freq.keySet()){
            minHeap.add(elem);
            if(minHeap.size()>k){
                minHeap.remove();
            }
        }

        int[] res=new int[minHeap.size()];
        for(int i=0;i<res.length;i++){
            res[i]=minHeap.remove();
        }
        return res;
    }
}
