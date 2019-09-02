package javase.多线程;

/*
 	java中的死锁，关键字synchronized
 		
 	创建两个字符串a和b
	再创建两个线程A和B
	让每个线程都用synchronized锁住字符串（A先锁a，再去锁b；B先锁b，再锁a）
	如果A锁住a，B锁住b
 	A就没办法锁住b，B也没办法锁住a
 	这时就陷入了死锁

 */

public class DeadLock {
	static Object obj1 = "obj1";
	static Object obj2 = "obj2";
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Lock1(),"线程1");
		t1.start();
		
		new Thread(new Lock2()).start();
	}
}
class Lock1 implements Runnable{
	
	public void run() {
		System.out.println(Thread.currentThread().getName() + "运行");
		try{
			 synchronized(DeadLock.obj1) {
				 System.out.println("Lock1锁住obj1");
				 Thread.sleep(1000);
				 
				 synchronized(DeadLock.obj2) {
					 //无法执行此代码
					 System.out.println("Lock1锁住obj2");
				 } 
			 } 
		}catch(InterruptedException e) {
			e.printStackTrace();
		} 
	}
}

class Lock2 implements Runnable{
	
	public void run() {
		System.out.println(Thread.currentThread().getName() + "运行");
		try{
			 synchronized(DeadLock.obj2) {
				 System.out.println("Lock2锁住obj1");
				 Thread.sleep(1000);
				 
				 synchronized(DeadLock.obj1) {
					 //无法执行此代码
					 System.out.println("Lock2锁住obj2");
				 } 
			 } 
		}catch(InterruptedException e) {
			e.printStackTrace();
		} 
	}
}


