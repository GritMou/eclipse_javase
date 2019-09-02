package javase.exception;
/*
 * 1、异常：java的异常都是类，在异常对象中携带一些信息给我们
 * 		我们可以通过这个异常对象把信息取出来。
 * 2、异常处理机制使程序更加健壮。
 * 3、所有的异常都是可抛出的
 * */
public class Exception01 {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		if(b!= 0){
			int c = a/b;
			System.out.println("a除以b等于"+c);
		}else {
			System.out.println("除数不能为0！");
		}
	}
}
