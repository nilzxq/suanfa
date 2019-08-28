package chapter_8_arrayandmatrix;
/** 
* @author nilzxq
* @version 2019年8月28日 下午7:25:35 
*类说明 
*/
public class Problem_04_FindMinKNums_copy {

	public static int[] getMinKNumsByHeap(int[] arr,int k) {
		if(k<1||k>arr.length) {
			return arr;
		}
		int[] kHeap=new int [k];
		for(int i=0;i!=k;i++) {
			//建堆
			heapInsert(kHeap,arr[i],i);
		}
		for(int i=k;i!=arr.length;i++) {
			if(arr[i]<kHeap[0]) {
				kHeap[0]=arr[i];
				//调整堆
				heapify(kHeap,0,k);
			}
		}
		return kHeap;
	}
	
	public static void heapInsert(int[] arr,int value,int index) {
		arr[index]=value;
		while(index!=0) {
			int parent=(index-1)/2;
			if(arr[parent]<arr[index]) {
				swap(arr,parent,index);
				index=parent;
			}else {
				break;
			}
		}
	}
	
	public static void heapify(int[] arr,int index,int heapSize) {
		int left=index*2+1;
		int right=index*2+2;
		int largest=index;
		while(left<heapSize) {
			if(arr[left]>arr[index]) {
				largest=left;
			}
			if(right<heapSize&&arr[right]>arr[largest]) {
				largest=right;
			}
			if(largest!=index) {
				swap(arr,largest,index);
			}else {
				break;
			}
			index=largest;
			left=index*2+1;
			right=index*2+2;
		}
	}
	
	public static void swap(int[] arr,int index1,int index2) {
		int tmp=arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=tmp;
	}
	
	public static void printArray(int[] arr) {
		for (int i = 0; i != arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = { 6, 9, 1, 3, 1, 2, 2, 5, 6, 1, 3, 5, 9, 7, 2, 5, 6, 1, 9 };
		// sorted : { 1, 1, 1, 1, 2, 2, 2, 3, 3, 5, 5, 5, 6, 6, 6, 7, 9, 9, 9 }
		printArray(getMinKNumsByHeap(arr, 10));
	}
}
