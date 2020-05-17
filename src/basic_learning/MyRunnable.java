package basic_learning;

import java.util.Date;

/** 
* @author nilzxq
* @version 2020年5月17日 下午3:21:55 
*类说明 
*/
public class MyRunnable implements Runnable{

	private String commond;
	
	public MyRunnable(String s) {
		this.commond=s;
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"Start Time= "+new Date());
		processCommand();
		System.out.println(Thread.currentThread().getName()+"End Time= "+new Date());
	}
	
	private void processCommand() {
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
	@Override
	public String toString() {
		return this.commond;
	}
}
