package javase.exception;
/*
 * 1���쳣��java���쳣�����࣬���쳣������Я��һЩ��Ϣ������
 * 		���ǿ���ͨ������쳣�������Ϣȡ������
 * 2���쳣�������ʹ������ӽ�׳��
 * 3�����е��쳣���ǿ��׳���
 * */
public class Exception01 {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		if(b!= 0){
			int c = a/b;
			System.out.println("a����b����"+c);
		}else {
			System.out.println("��������Ϊ0��");
		}
	}
}
