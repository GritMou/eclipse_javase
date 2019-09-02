package javase.IllegalNmaeException;

public class Test { //不能用throws
	public static void main(String[] args) {
		//用户名
		String username= "jack";
		
		//注册
		CustomerService cs = new CustomerService();
		try {
			cs.register(username);
		} catch (IllegalNmaeException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
}
