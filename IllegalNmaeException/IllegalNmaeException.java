package javase.IllegalNmaeException;
 /* 
    * �Զ��塰��Ч���֡��쳣 
  * 	1.����ʱ�쳣��ֱ�Ӽ̳�Exception
  * 	2.����ʱ�쳣��ֱ�Ӽ̳�RuntimeException.
  */
public class IllegalNmaeException extends Exception{  //����ʱ�쳣
	
	public IllegalNmaeException() {}
	
	public IllegalNmaeException(String msg) {
		super(msg);
	}
		
}
