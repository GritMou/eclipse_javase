package javase.多线程;
/*
 * 	java实现多线程第二种方式
 * 		1.实现java.lang.Runnable;接口
 * 		2.实现run();方法
 * 
 */
public class ThreadTest02 {
	public static void main(String[] args) {
		
		//创建线程
		Thread t = new Thread (new Processor2());
		//启动线程
		t.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("main-->"+i);
		}
	}
}

//这种方式除了实现接口之外，还保留了类的继承
class Processor2 implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("run-->"+i);
		}
	}
	
}
