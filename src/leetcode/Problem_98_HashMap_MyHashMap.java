package leetcode;
/** 
* @author nilzxq
* @version 2020年2月7日 上午11:46:36 
*类说明 
*/
public class Problem_98_HashMap_MyHashMap {

	public static class MyHashMap{
		private static int[] arr;
		/** Initialize your data structure here. */
	    public MyHashMap() {
	        arr=new int[1000000];
	        for(int i=0;i<arr.length;i++) {
	        	arr[i]=-1;
	        }
	    }
	    
	    /** value will always be non-negative. */
	    public void put(int key, int value) {
	        arr[key]=value;
	    }
	    
	    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
	    public int get(int key) {
	        return arr[key];
	    }
	    
	    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
	    public void remove(int key) {
	        arr[key]=-1;
	    }
	    
	    public static void main(String[] args) {
	    	MyHashMap hashMap = new MyHashMap();
	        hashMap.put(1, 1);
	        hashMap.put(2, 2);
	        System.out.println(hashMap.get(1));
	        System.out.println(hashMap.get(3));
	        hashMap.put(2, 1);
	        System.out.println(hashMap.get(2));
	        hashMap.remove(2);
	        System.out.println(hashMap.get(2));
		}
	}
}
