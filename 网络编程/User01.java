package javase.������;

public class User01 {
	public static void main(String[] args) {
		new SendThread(878).start();
		new ReceiveThread(879).start();
		
	}
}
