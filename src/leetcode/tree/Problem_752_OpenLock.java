package leetcode.tree;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * @Author nilzxq
 * @Date 2020-08-16 12:49
 */
public class Problem_752_OpenLock {

    public int openLock(String[] deadends,String target){
        //记录需要跳过的死亡密码
        Set<String> deads=new HashSet<>();
        for(String s:deadends){
            deads.add(s);
        }
        //记录已经穷举过的密码，防止走回头路
        Set<String> visited=new HashSet<>();
        Queue<String> queue=new LinkedList<>();
        //从起点开始启动广度优先搜索
        int step=0;
        queue.offer("0000");
        visited.add("0000");
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                String cur=queue.poll();
                //判断是否到达终点
                if(deads.contains(cur)){
                    continue;
                }
                if(cur.equals(target)){
                    return step;
                }
                //将一个节点的未遍历相邻节点加入队列
                for(int j=0;j<4;j++){
                    String up=plusOne(cur,j);
                    if(!visited.contains(up)){
                        queue.offer(up);
                        visited.add(up);
                    }
                    String down=downOne(cur,j);
                    if(!visited.contains(down)){
                        queue.offer(down);
                        visited.add(down);
                    }
                }

            }
            step++;
        }
        //如果穷举完都没有找到目标密码，那就是找不到了
        return -1;
    }
    //s[j]向上拨动一次
    public String plusOne(String s,int j){
        char[] ch=s.toCharArray();
        if(ch[j]=='9'){
            ch[j]='0';
        }else{
            ch[j]+=1;
        }
        return new  String(ch);
    }

    //s[j]向下拨动一次
    public String downOne(String s,int j){
        char[] ch=s.toCharArray();
        if(ch[j]=='0'){
            ch[j]='9';
        }else{
            ch[j]-=1;
        }
        return new String(ch);
    }

    //BFS框架，打印出所有可能的密码
    public void BFS(String target){
        Queue<String> q=new LinkedList<>();
        q.offer("0000");
        while(!q.isEmpty()){
            int sz=q.size();
            /**
             * 当前队列中的所有节点向四周扩散
             */
            for(int i=0;i<sz;i++){
                String cur=q.poll();
                //判断是否到达终点
                System.out.println(cur);
                //将一个节点的相邻节点加入队列
                for(int j=0;j<4;j++){
                    String up=plusOne(cur,j);
                    String down=downOne(cur,j);
                    q.offer(up);
                    q.offer(down);
                }
            }
            //这里增加步数
        }
        return;
    }
}
