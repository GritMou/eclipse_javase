package javase.多线程;
/*
 * 	java实现多线程第一种方式
 * 		1.继承java.lang.Thread
 * 		2.重写run方法
 * 
 * 
 */
public class ThreadTest01 {
	public static void main(String[] args) {
		 
		//创建线程
		Thread t = new Processor();
		
		//启动线程
		t.start();
		
		for(int i=0;i<10;i++) {
		System.out.println("main-->"+i);
		}
	}
}

class Processor extends Thread{
	//重写run方法
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("run-->"+i);
		}
	}
}
