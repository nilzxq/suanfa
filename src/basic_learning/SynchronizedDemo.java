package basic_learning;
/** 
* @author nilzxq
* @version 2020年5月16日 上午10:34:39 
*类说明 
*/
public class SynchronizedDemo {

	public void method() {
		synchronized(this) {
			System.out.println("synchronized 代码块");
		}
	}
}
