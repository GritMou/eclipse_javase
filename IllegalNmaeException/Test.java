package javase.IllegalNmaeException;

public class Test { //������throws
	public static void main(String[] args) {
		//�û���
		String username= "jack";
		
		//ע��
		CustomerService cs = new CustomerService();
		try {
			cs.register(username);
		} catch (IllegalNmaeException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
}
