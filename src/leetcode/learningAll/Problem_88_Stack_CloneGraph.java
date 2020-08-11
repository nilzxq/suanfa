package leetcode.learningAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
* @author nilzxq
* @version 2020年1月28日 下午8:54:52
*类说明
*/
public class Problem_88_Stack_CloneGraph {

	public static class Node{

	public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }


	}

	public static Node cloneGraph(Node node) {
		 if (node == null) return node;
	        Queue<Node> queue = new LinkedList<>();//借助队列实现BFS
	        Map<Node, Node> map = new HashMap<>();//哈希映射
	        Node head = new Node(node.val, new ArrayList<>());//头节点
	        map.put(node, head);//哈希映射原节点和新节点
	        queue.add(node);//原节点加入到队列
	        while (!queue.isEmpty()) {//队列不为空就重复循环
	            Node tmp = queue.poll();//弹出队列头节点
	            for (Node n : tmp.neighbors) {//遍历邻居节点
	                if (!map.containsKey(n)) {//字典的键不包含该节点时
	                    map.put(n, new Node(n.val, new ArrayList<>()));//新建映射关系加入字典
	                    queue.add(n);//加入队列
	                }
	                map.get(tmp).neighbors.add(map.get(n));//加入邻居节点
	            }
	        }
	        return head;

    }
}
