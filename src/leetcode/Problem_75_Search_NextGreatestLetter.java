package leetcode;
/** 
* @author nilzxq
* @version 2020年1月14日 下午4:12:04 
*类说明 
*/
public class Problem_75_Search_NextGreatestLetter {

	public static char nextGeatestLetter(char[] letters,char target) {
		int length=letters.length;
		int left=0;
		int right=length-1;
		while(left<=right) {
			int mid=left+(right-left)/2;
			if(letters[mid]<=target) {
				left=mid+1;
			}else {
				right=mid-1;
			}
		}
		return left<length?letters[left]:letters[0];
	}
	
	public static void main(String[] args) {
		char[] letters= {'c','f','j'};
		System.out.println(nextGeatestLetter(letters,'a'));
	}
}
