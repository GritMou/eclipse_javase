package javase.date;
//���������
import java.util.Random;
public class RandomTest {
	public static void main(String[] args) {
		//����һ���µ������������
		Random r = new Random();
		
		//����int���͵������
		int e =r.nextInt(101);//[0-100]
		System.out.println(e);
		
		//ѭ������5�����ظ��������
		int[] a= new int[5];
		
		for(int i=0;i<5;i++) {
			
			a[i] = r.nextInt(5);//[0-4]
			
			for(int j=0;j<i;j++) {
				
				if(a[i]==a[j]) {
					
					i--;
					break;
				}
			}
		}
		for(int i=0;i<5;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
