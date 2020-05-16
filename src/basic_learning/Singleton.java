package basic_learning;
/** 
* @author nilzxq
* @version 2020年5月16日 上午10:18:32 
*类说明 
*/
public class Singleton {

	private volatile static Singleton uniqueInstance;
	
	private Singleton(){
		
	}
	
	public static Singleton getUniqueInstance() {
		//先判断对象是否已经实例过，没有实例化才进入加锁代码
		if(uniqueInstance==null) {
			//类对象枷锁
			synchronized(Singleton.class) {
				if(uniqueInstance==null) {
					uniqueInstance=new Singleton();
				}
			}
		}
		return uniqueInstance;
	}
	
	public static void main(String[] args) {
		Singleton s=new Singleton();
		System.out.println(s.getUniqueInstance());
	}
}
