package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/** 
* @author nilzxq
* @version 2020年1月24日 下午9:09:21 
*类说明 
*/
public class Problem_84_Queue_OpenLock {

	public static int openLock(String[] deadends,String target) {
//		HashSet<String> deadSet=new HashSet<>(Arrays.asList(deadends));
//		if(deadSet.contains("0000")) return -1;
//		Queue<String> queue=new LinkedList<>();
//		queue.add("0000");
//		int count=0;
//		while(!queue.isEmpty()) {
//			int size=queue.size();
//			while(size==0) {
//				String tmp=queue.remove();
//				if(target.equals(tmp)) return count;
//				char[] c=tmp.toCharArray();
//				for(int j=0;j<4;j++) {
//					int i=c[j]-'0';
//					c[j]=(char)('0'+(i+9)%10);
//					String s=new String(c);
//					if(!deadSet.contains(s)) {
//						queue.add(s);
//						deadSet.add(s);
//					}
//					c[j]=(char)('0'+(i+11)%10);
//					s=new String(c);
//					if(!deadSet.contains(s)) {
//						queue.add(s);
//						deadSet.add(s);
//					}
//					c[j]=(char)('0'+i);
//				}
//			}
//			count++;
//		}
//		return -1;
		Set<String> dead = new HashSet();
        for (String d: deadends) dead.add(d);

        Queue<String> queue = new LinkedList();
        queue.offer("0000");
        queue.offer(null);

        Set<String> seen = new HashSet();
        seen.add("0000");

        int depth = 0;
        while (!queue.isEmpty()) {
            String node = queue.poll();
            if (node == null) {
                depth++;
                if (queue.peek() != null)
                    queue.offer(null);
            } else if (node.equals(target)) {
                return depth;
            } else if (!dead.contains(node)) {
                for (int i = 0; i < 4; ++i) {
                    for (int d = -1; d <= 1; d += 2) {
                        int y = ((node.charAt(i) - '0') + d + 10) % 10;
                        String nei = node.substring(0, i) + ("" + y) + node.substring(i+1);
                        if (!seen.contains(nei)) {
                            seen.add(nei);
                            queue.offer(nei);
                        }
                    }
                }
            }
        }
        return -1;

//作者：LeetCode
//链接：https://leetcode-cn.com/problems/open-the-lock/solution/da-kai-zhuan-pan-suo-by-leetcode/
//来源：力扣（LeetCode）
//著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
	}
	
	public static void main(String[] args) {
		String[] deadends= {"0201","0101","0102","1212","2002"};
		String target = "0202";
		System.out.println(openLock(deadends,target));
		
	}
}
