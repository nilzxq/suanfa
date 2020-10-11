package leetcode.LRU;

import java.util.Arrays;
import java.util.LinkedHashMap;

/**
 * @Author nilzxq
 * @Date 2020-10-11 17:36
 */
public class LRUCache {
    int cap;
    LinkedHashMap<Integer,Integer> cache=new LinkedHashMap<>();
    public LRUCache(int capacity){
        this.cap=capacity;
    }

    public int get(int key){
        if(!cache.containsKey(key)){
            return -1;
        }
        //将key变为最近使用
        makeRecently(key);
        return cache.get(key);
    }

    public void put(int key,int val){
        if(cache.containsKey(key)){
            //修改key的值
            cache.put(key,val);
            //将key变为最近使用
            makeRecently(key);
            return;
        }
        if(cache.size()>=this.cap){
            //链表头部就是最久未使用的key
            int oldestKey=cache.keySet().iterator().next();
            cache.remove(oldestKey);
        }
        //将新的key添加链表尾部
        cache.put(key,val);
    }

    private void makeRecently(int key){
        int val=cache.get(key);
        //删除key 重新插入到队尾
        cache.remove(key);
        cache.put(key,val);
    }

    public static void main(String[] args) {
        int[][] operators = {{1, 2, 1}, {1, 2, 2}, {1, 3, 2}, {2, 1}, {1, 4, 4}, {2, 2}};

        int[] ints = LRU(operators, 3);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] LRU(int[][] operators, int k) {
        int len = (int) Arrays.stream(operators).filter(operator -> operator[0] == 2).count();
        int[] ret = new int[len];
        LRUCache lruCache = new LRUCache(k);
        int index = 0;
        for (int[] operator : operators) {
            if (operator[0] == 1) {
                lruCache.put(operator[1], operator[2]);
            } else {
                ret[index] = lruCache.get(operator[1]);
                index++;
            }
        }
        return ret;
    }
}
