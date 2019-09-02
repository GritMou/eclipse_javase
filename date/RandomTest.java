package javase.date;
//生成随机数
import java.util.Random;
public class RandomTest {
	public static void main(String[] args) {
		//创建一个新的随机数生成器
		Random r = new Random();
		
		//生成int类型的随机数
		int e =r.nextInt(101);//[0-100]
		System.out.println(e);
		
		//循环生成5个不重复的随机数
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
