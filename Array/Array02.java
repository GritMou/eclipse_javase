package javase.Array;

//��������ʱ����һ������

public class Array02 {
	public static void main(String[] args) {
			
		//��һ��
		int[] a = {1,2,3,4,5,6};
		m1(a);
		
		//�ڶ���
		m1(new int[] {8,9,10});
	}
		public static void m1(int[] a) {
			for(int i=0;i<a.length;i++) {
				System.out.println(a[i]);
			}
		}
}
