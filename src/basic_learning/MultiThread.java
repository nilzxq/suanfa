package basic_learning;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/** 
* @author nilzxq
* @version 2020年5月16日 上午8:13:50 
*类说明 
*/
public class MultiThread {

	public static void main(String[] args) {
		//获取Java线程管理MXBean
		ThreadMXBean threadMXBean=ManagementFactory.getThreadMXBean();
		//不需要获取同步的monitor和synchronizer信息，仅获取线程和线程堆栈信息
		//public ThreadInfo[] dumpAllThreads(boolean lockedMonitors, boolean lockedSynchronizers);
		ThreadInfo[] threadInfos=threadMXBean.dumpAllThreads(false,false);
		//遍历线程信息，仅打印线程ID和线程名称信息
        for (ThreadInfo threadInfo : threadInfos) {
          System.out.println("["+threadInfo.getThreadId()+"]"+threadInfo.getThreadName());
        }
	}
}
