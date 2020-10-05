package leetcode.set;

import java.util.*;

/**
 * @Author nilzxq
 * @Date 2020-10-05 9:16
 */
public class Problem_380_RandomizedSet {
    //记录每个元素对应的list中的索引
    Map<Integer,Integer> map;
    //存储元素的值
    List<Integer> list;
    public Problem_380_RandomizedSet(){
        map=new HashMap<>();
        list=new ArrayList<>();
    }

    /** 如果 val 不存在集合中，则插入并返回 true，否则直接返回 false */
    public boolean insert(int val){
        if(!map.containsKey(val)){
            //若val不存在，插入到nums尾部
            map.put(val,list.size());
            list.add(val);
            return true;
        }
        return false;
    }

    public boolean remove(int val){
        if(map.containsKey(val)){
            int index=map.remove(val);
            list.set(index,Integer.MIN_VALUE);
            return true;
        }
        return false;
    }

    public int getRandom(){
        Random rm=new Random();
        int i=rm.nextInt(list.size());
        while(list.get(i)==Integer.MIN_VALUE){
            i=rm.nextInt(list.size());
        }
        return list.get(i);
    }

    public static void main(String[] args) {
        Problem_380_RandomizedSet randomSet=new Problem_380_RandomizedSet();
        // 向集合中插入 1 。返回 true 表示 1 被成功地插入。
        System.out.println(randomSet.insert(1));

// 返回 false ，表示集合中不存在 2 。
        System.out.println(randomSet.remove(2));

// 向集合中插入 2 。返回 true 。集合现在包含 [1,2] 。
        System.out.println(randomSet.insert(2));

// getRandom 应随机返回 1 或 2 。
        System.out.println(randomSet.getRandom());

// 从集合中移除 1 ，返回 true 。集合现在包含 [2] 。
        System.out.println(randomSet.remove(1));

// 2 已在集合中，所以返回 false 。
        System.out.println(randomSet.insert(2));

// 由于 2 是集合中唯一的数字，getRandom 总是返回 2 。
        System.out.println(randomSet.getRandom());


    }
}
