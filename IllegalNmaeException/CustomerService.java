package javase.IllegalNmaeException;

public class CustomerService {
	public void register(String name) throws IllegalNmaeException {
		
		//���ע��
		if(name.length()<6) {
			/*
			IllegalNmaeException e = new IllegalNmaeException("�û������Ȳ�������6λ!");
			//�ֶ��׳��쳣
			throw e;
			*/
			 throw new IllegalNmaeException("�û������Ȳ�������6λ!");
		}
		System.out.println("ע��ɹ���");
	}
}
