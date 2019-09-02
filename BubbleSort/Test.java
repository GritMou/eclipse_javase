package javase.BubbleSort;

//import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int[] a= {3,4,1,2,6,7,10,20};
		new BubbleSort().sort(a);
		//±éÀú
		//System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
