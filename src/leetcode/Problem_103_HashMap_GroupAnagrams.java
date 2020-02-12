package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** 
* @author nilzxq
* @version 2020年2月12日 下午5:27:45 
*类说明 
*/
public class Problem_103_HashMap_GroupAnagrams {

	public static List<List<String>> groupAnagrams(String[] strs){
		List<List<String>> listList=new ArrayList<>();
		HashMap<String,List<String>> hashMap=new HashMap<>();
		for(int i=0;i<strs.length;i++) {
			char[] array=strs[i].toCharArray();
			Arrays.sort(array);
			String tempString=String.valueOf(array);
			if(hashMap.containsKey(tempString)) {
				hashMap.get(tempString).add(strs[i]);
			}else {
				List<String> list=new ArrayList<>();
				list.add(strs[i]);
				hashMap.put(tempString, list);
			}
		}
		for(String string:hashMap.keySet()) {
			listList.add(hashMap.get(string));
		}
		return listList;
	}
	
	//https://leetcode-cn.com/problems/group-anagrams/solution/zi-mu-yi-wei-ci-fen-zu-by-leetcode/
	public static List<List<String>> groupAnagrams2(String[] strs){
		if(strs.length==0) return new ArrayList<>();
		Map<String,List<String>> ans=new HashMap<>();
		for(String s:strs) {
			char[] cha=s.toCharArray();
			Arrays.sort(cha);
			String key=String.valueOf(cha);
			if(!ans.containsKey(key)) ans.put(key, new ArrayList<>());
			ans.get(key).add(s);
		}
		return new ArrayList<>(ans.values());
	}
	
	
	public static void main(String[] args) {
		String[] strs= {"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(groupAnagrams(strs));
	}
}
