package douyu_2017_09_14;

/**
 * 换钱的方法数
 * 
 * @author ZXQ20
 *
 */
public class Problem_01_CoinsWay {

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
	 *            第几种钱
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
}
