package leetcode.tree;

import sun.reflect.generics.tree.Tree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author nilzxq
 * @Date 2020-08-14 10:58
 */
public class Problem_297_CodeC {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val=x;
        }
    }
    public String rserialize(TreeNode root,String str){
        if(root==null){
            str+="None,";
        }else{
            str+= String.valueOf(root.val)+",";
            str=rserialize(root.left,str);
            str=rserialize(root.right,str);
        }
        return str;
    }
    public String serialize(TreeNode root){
        return rserialize(root,"");
    }

    public TreeNode rdeserialize(List<String> l){
        if(l.get(0).equals("None")){
            l.remove(0);
            return null;
        }
        TreeNode root=new TreeNode(Integer.valueOf(l.get(0)));
        l.remove(0);
        root.left=rdeserialize(l);
        root.right=rdeserialize(l);
        return root;
    }
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] data_array=data.split(",");
        List<String> data_list=new LinkedList<String>(Arrays.asList(data_array));
        return rdeserialize(data_list);
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.right.left=new TreeNode(4);
        root.right.right=new TreeNode(5);

         Problem_297_CodeC codec = new Problem_297_CodeC();
         codec.deserialize(codec.serialize(root));
    }
}
