package javase.���߳�;
/*
 * 	javaʵ�ֶ��̵߳ڶ��ַ�ʽ
 * 		1.ʵ��java.lang.Runnable;�ӿ�
 * 		2.ʵ��run();����
 * 
 */
public class ThreadTest02 {
	public static void main(String[] args) {
		
		//�����߳�
		Thread t = new Thread (new Processor2());
		//�����߳�
		t.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("main-->"+i);
		}
	}
}

//���ַ�ʽ����ʵ�ֽӿ�֮�⣬����������ļ̳�
class Processor2 implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("run-->"+i);
		}
	}
	
}
