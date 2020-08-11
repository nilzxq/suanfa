package leetcode.learningAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* @author nilzxq
* @version 2020年2月10日 下午4:02:44
*类说明
*/
public class Problem_101_List_FindRestaurant {

	public static String[] findRestaurant(String[] list1,String[] list2) {
		Map<String,Integer> map=new HashMap<>();
		for(int i=0;i<list1.length;i++) {
			map.put(list1[i],i);
		}
		List<String> res=new ArrayList<>();
		int sum=Integer.MAX_VALUE;
		for(int i=0;i<list2.length;i++) {
			if(map.containsKey(list2[i])) {
				int tmp=i+map.get(list2[i]);
				if(tmp<sum) {
					res.clear();
					res.add(list2[i]);
					sum=tmp;
				}else if(tmp==sum) res.add(list2[i]);
			}
		}

		return  res.toArray(new String[res.size()]);
	}

	public static void main(String[] args) {
		String[] l1= {"Shogun", "Tapioca Express", "Burger King", "KFC"};
		String[] l2= {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
		String[] res=findRestaurant(l1,l2);
		System.out.println(res[0]);
	}
}
