package javase.IllegalNmaeException;
 /* 
    * 自定义“无效名字”异常 
  * 	1.编译时异常，直接继承Exception
  * 	2.运行时异常，直接继承RuntimeException.
  */
public class IllegalNmaeException extends Exception{  //编译时异常
	
	public IllegalNmaeException() {}
	
	public IllegalNmaeException(String msg) {
		super(msg);
	}
		
}
