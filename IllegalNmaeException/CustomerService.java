package javase.IllegalNmaeException;

public class CustomerService {
	public void register(String name) throws IllegalNmaeException {
		
		//完成注册
		if(name.length()<6) {
			/*
			IllegalNmaeException e = new IllegalNmaeException("用户名长度不能少于6位!");
			//手动抛出异常
			throw e;
			*/
			 throw new IllegalNmaeException("用户名长度不能少于6位!");
		}
		System.out.println("注册成功！");
	}
}
