package javase.Arrays;
import java.util.Arrays;
public class ArraysTest {
	public static void main(String[] args) {
		int[] a= {3,2,-1,0,9};
		//≈≈–Ú
		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
