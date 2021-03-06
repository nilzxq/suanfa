package douyu_2017_09_14;

/**
 * 换钱的方法数
 * 
 * @author ZXQ
 *
 */
public class Problem_01_CoinsWay {
	/**
	 * 方法1 从前往后推
	 * 
	 * @param arr
	 * @param aim
	 * @return
	 */
	public static int coins1(int[] arr, int aim) {
		if (arr == null || arr.length == 0 || aim < 0) {
			return 0;
		}
		return process1(arr, 0, aim);
	}

	/**
	 * 
	 * @param arr
	 *            面值组成的数值
	 * @param index
	 *            考虑到第几种钱
	 * @param aim
	 *            总钱数
	 * @return
	 */
	public static int process1(int[] arr, int index, int aim) {
		int res = 0;
		// 递归的终止条件 以5,3,2为例凑成10，5*1+3*1+2*1
		// 此时循环index==arr.length，aim==0,所有的面值都试过了，找到一种方法，否则没找到
		if (index == arr.length) {
			res = aim == 0 ? 1 : 0;
		} else {
			for (int i = 0; arr[index] * i <= aim; i++) {
				res += process1(arr, index + 1, aim - arr[index] * i);
			}
		}
		return res;
	}

	/**
	 * 方法2 从后往前推
	 * 
	 * @param arr
	 * @param aim
	 * @return
	 */
	public static int coinsOther(int[] arr, int aim) {

		if(arr==null||arr.length==0||aim<0){
			return 0;
		}
		return processOther(arr,arr.length-1,aim);
	}
	
	public static int processOther(int[] arr,int index,int aim){
		int res=0;
		if(index==-1){
			res=aim==0?1:0;
		}else{
			for(int i=0;arr[index]*i<=aim;i++){
				res+=processOther(arr,index-1,aim-arr[index]*i);
			}
		}
		return res;
	}
	/**
	 * 记忆搜索
	 * @param arr
	 * @param aim
	 * @return
	 */
	public static int coins2(int[] arr,int aim){
	
		if(arr==null||arr.length==0||aim<0){
			return 0;
		}
			int[][] map=new int[arr.length+1][aim+1];
		return process2(arr,0,aim,map);
	}
	
	public static int process2(int[] arr,int index,int aim,int[][] map){
	
		int res=0;
		if(index==arr.length){
			return res=aim==0?1:0;
		}else{
			int mapValue=0;
			for(int i=0;arr[index]*i<=aim;i++){
				mapValue=map[index+1][aim-arr[index]*i];
				if(mapValue!=0){
					res+=mapValue==-1?0:mapValue;
				}else{
					res+=process2(arr,index+1,aim-arr[index]*i,map);
				}
			}
		}
		map[index][aim]=res==0?-1:res;
		return res;
	}
}
