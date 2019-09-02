package javase.���߳�;

/*
 	java�е��������ؼ���synchronized
 		
 	���������ַ���a��b
	�ٴ��������߳�A��B
	��ÿ���̶߳���synchronized��ס�ַ�����A����a����ȥ��b��B����b������a��
	���A��סa��B��סb
 	A��û�취��סb��BҲû�취��סa
 	��ʱ������������

 */

public class DeadLock {
	static Object obj1 = "obj1";
	static Object obj2 = "obj2";
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Lock1(),"�߳�1");
		t1.start();
		
		new Thread(new Lock2()).start();
	}
}
class Lock1 implements Runnable{
	
	public void run() {
		System.out.println(Thread.currentThread().getName() + "����");
		try{
			 synchronized(DeadLock.obj1) {
				 System.out.println("Lock1��סobj1");
				 Thread.sleep(1000);
				 
				 synchronized(DeadLock.obj2) {
					 //�޷�ִ�д˴���
					 System.out.println("Lock1��סobj2");
				 } 
			 } 
		}catch(InterruptedException e) {
			e.printStackTrace();
		} 
	}
}

class Lock2 implements Runnable{
	
	public void run() {
		System.out.println(Thread.currentThread().getName() + "����");
		try{
			 synchronized(DeadLock.obj2) {
				 System.out.println("Lock2��סobj1");
				 Thread.sleep(1000);
				 
				 synchronized(DeadLock.obj1) {
					 //�޷�ִ�д˴���
					 System.out.println("Lock2��סobj2");
				 } 
			 } 
		}catch(InterruptedException e) {
			e.printStackTrace();
		} 
	}
}


