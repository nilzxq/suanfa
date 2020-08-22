package leetcode.dp;

import leetcode.list.Problem_19_RemoveNthFromEnd;

import java.util.ArrayList;
import java.util.List;

/**
 * 207 课程表
 * 有向无环图
 * @Author nilzxq
 * @Date 2020-08-22 7:59
 */
public class Problem_207_CanFinish {

    public static void main(String[] args) {
        int[][] arr={{1,0},{0,1}};
        System.out.println(canFinish(2,arr));
    }
    //图
    public static boolean canFinish(int numCourses,int[][] prerequisites){
        List<List<Integer>> gragh=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            gragh.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
            gragh.get(prerequisites[i][1]).add(prerequisites[i][0]);
            //System.out.println(prerequisites[i][1]);
        }
        int[] visited=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            if(finCircle(i,visited,gragh)){
                return false;
            }
        }
        return true;
    }

    //找环
    public static boolean finCircle(int node, int[] visited, List<List<Integer>> graph){
        //为1表示有环，返回true
        if(visited[node]==1){
            return true;
        }
        //已经走过的点且无环的，防止再重复走，标记为1
        if(visited[node]==2){
            return false;
        }
        visited[node]=1;
        for(Integer next:graph.get(node)){
            if(finCircle(next,visited,graph)){
                return true;
            }
        }
        visited[node]=2;
        return false;
    }
}
