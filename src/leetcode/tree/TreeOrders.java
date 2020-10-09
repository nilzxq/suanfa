package leetcode.tree;

import java.util.ArrayList;

/**
 * @Author nilzxq
 * @Date 2020-10-09 15:02
 */
public class TreeOrders {
    public class TreeNode{
        int val=0;
        TreeNode left=null;
        TreeNode right=null;
    }

    private static ArrayList<Integer> first=new ArrayList<>();
    private static ArrayList<Integer> mid=new ArrayList<>();
    private static ArrayList<Integer> last=new ArrayList<>();

    //先序
    public static void firstCode(TreeNode root){
        if(root!=null){
            first.add(root.val);
            firstCode(root.left);
            firstCode(root.right);
        }
    }

    //中序
    public static void midCode(TreeNode root){
        if(root!=null){
            midCode(root.left);
            mid.add(root.val);
            midCode(root.right);
        }
    }

    //后序
    public static void lastCode(TreeNode root){
        if(root!=null){
            lastCode(root.left);
            lastCode(root.right);
            last.add(root.val);
        }
    }

    //让ArrayList转换为整型数组
    private static final int[] change(ArrayList<Integer> array){
        int[] intArr=array.stream().mapToInt(Integer::intValue).toArray();
        return intArr;
    }

    public int[][] threeOrders(TreeNode root){
        int[][] res=new int[3][];
        firstCode(root);
        midCode(root);
        lastCode(root);
        res[0]=change(first);
        res[1]=change(mid);
        res[2]=change(last);
        return res;
    }

}
