package basic_learning;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/** 
* @author nilzxq
* @version 2020年4月23日 上午11:33:09 
*类说明 
*/
public class Problem_02_Set {

	/**
	 * Java 9 List,Set,Map接口中，新的静态工厂方法可以创建这些集合的不可变实例。
	 * @param args
	 */
	public static void main(String[] args) {
		//旧方法
		Set<String> set=new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		set=Collections.unmodifiableSet(set);
		System.out.println(set);
		List<String> list=new ArrayList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list=Collections.unmodifiableList(list);
		System.out.println(list);
		Map<String,String> map=new HashMap<>();
		
		map.put("A","Apple");
		map.put("B","Boy");
		map.put("C","Cat");
		map=Collections.unmodifiableMap(map);
		System.out.println(map);
		/**
		 * 新方法创建集合
		 * Java 9 中，以下方法被添加到 List，Set 和 Map 接口以及它们的重载对象。
		 * static <E> List<E> of(E e1, E e2, E e3);
		 * static <E> Set<E>  of(E e1, E e2, E e3);
		 * static <K,V> Map<K,V> of(K k1, V v1, K k2, V v2, K k3, V v3);
		 * static <K,V> Map<K,V> ofEntries(Map.Entry<? extends K,? extends V>... entries)
		 * 
		 * List 和 Set 接口, of(...) 方法重载了 0 ~ 10 个参数的不同方法 。
		 * Map 接口, of(...) 方法重载了 0 ~ 10 个参数的不同方法 。
		 * Map 接口如果超过 10 个参数, 可以使用 ofEntries(...) 方法。
		 */
		Set<String> set1=Set.of("A","B","C");
		System.out.println(set);
	      List<String> list1 = List.of("A", "B", "C");
	      System.out.println(list1);
	      Map<String, String> map1 = Map.of("A","Apple","B","Boy","C","Cat");
	      System.out.println(map1);
	  
	      Map<String, String> map2 = Map.ofEntries (
	         new AbstractMap.SimpleEntry<>("A","Apple"),
	         new AbstractMap.SimpleEntry<>("B","Boy"),
	         new AbstractMap.SimpleEntry<>("C","Cat"));
	      System.out.println(map2);
	}
	
	
}
