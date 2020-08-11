package leetcode.learningAll;
/**
* @author nilzxq
* @version 2020年2月6日 下午8:18:08
*类说明
*/
public class Problem_97_HashSet_MyHashSet {

	public static class MyHashSet{
		private static int[] arr;
		/** Initialize your data structure here. */
	    public MyHashSet() {
	        arr=new int[1000000];
	        for(int i=0;i<arr.length;i++) {
	        	arr[i]=-1;
	        }
	    }

	    public void add(int key) {
	        arr[key]=key;
	    }

	    public void remove(int key) {
	        if(arr[key]!=key) {
	        	return;
	        }else {
	        	arr[key]=-1;
	        }
	    }

	    /** Returns true if this set contains the specified element */
	    public boolean contains(int key) {
	        if(arr[key]==key)
	        	return true;
	        return false;
	    }

	    public static void main(String[] args) {
	    	MyHashSet hashSet = new MyHashSet();
	    	hashSet.add(1);
	    	hashSet.add(2);
	    	System.out.println(hashSet.contains(1));   // returns true
	    	System.out.println(hashSet.contains(3));    // returns false (not found)
	    	hashSet.add(2);
	    	System.out.println(hashSet.contains(2));    // returns true
	    	hashSet.remove(2);
	    	System.out.println(hashSet.contains(2));    // returns false (already removed)
		}
	}
}
