package javase.exception;
public class Exception08 {
	public static void main(String[] args) {
		int i = m1();
		System.out.println(i);	//10
	}
	
	public static int m1() {
		int i =10;
		try {
			
			return i;
			//int temp = i;
			//return temp;
			
		}finally {
			i++;
			System.out.println("m1µÄi="+i);	//11
		}
	}
}
