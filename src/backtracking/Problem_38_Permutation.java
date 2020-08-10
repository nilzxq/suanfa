package backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * @Author nilzxq
 * @Date 2020-08-10 9:02
 * 字符串的排序
 * 回溯算法
 * 1.审题 最长为8 所以可以暴力
 * 字符有重复怎么办  =》 先去重
 * 结果中不能有重复元素
 * a b c
 * 按位填 每个位置有几种可能，剩余位置就要除去这个位置之后的字符中选
 */
public class Problem_38_Permutation {
    //TreeSet为了去重
    static TreeSet<String> result;
    public static ArrayList<String> permutation(String s){
        if(s==null||s.length()<1){
            return new ArrayList<>();
        }
        //字符串变成集合为了增删操作方便
        List<Character> chars=new ArrayList<>();
        //去重和排序 aab
        result=new TreeSet<>();
        for(char c:s.toCharArray()){
            chars.add(c);
        }
        helper(chars,new StringBuffer(),s.length(),0);
        return new ArrayList<>(result);
    }

    //leetcode上返回的是String[]
    public String[] permutation1(String s) {
        if(s.length()==0){
            return new String[0];
        }
        //字符串变成集合为了增删操作方便
        List<Character> chars=new ArrayList<>();
        //去重和排序 aab
        result=new TreeSet<>();
        for(char c:s.toCharArray()){
            chars.add(c);
        }
        helper(chars,new StringBuffer(),s.length(),0);
        String[] arr=result.toArray(new String[result.size()]);
        return arr;
    }


    public static void helper(List<Character> arr,StringBuffer buffer,int len,int index){
        //递归结束条件
        if(index==len){
            result.add(buffer.toString());
        }
        for(int i=0;i<arr.size();i++){
            //主要是四步
            //1.选择一个字符加入buffer
            char c=arr.get(i);
            buffer.append(c);
            //2.移除arr里面的i
            arr.remove(i);
            //3.把剩余字符添加进不同位置的情况
            helper(arr,buffer,len,index+1);
            //4.下次从头开始添加前 先把字符再加回来
            arr.add(i,c);
            //？？？？在buffer后面添加的 而不是修改对应位置的值 删掉最后一位的值
            //注意一点，回溯到当前层次时，记得把之前加入路径的元素取出，因为当前位置已经完成了一次搜索
            //画个图 再加上debug步骤反复理解一下
            //   a
            // b   c
            //c      b
             buffer.deleteCharAt(buffer.length()-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(permutation("abc"));
    }
}
