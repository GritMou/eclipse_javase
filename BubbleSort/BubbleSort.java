package javase.BubbleSort;
/*
 * 	ð������
 * 	ԭ�����ٽ��������������бȽ�,���մ�С������ߴӴ�С��˳����н���
 *  3 1 5 4 2
 *  
 *  1 2 3 4 5
 * */
//ʵ�ֽӿ���
public class BubbleSort implements Sort{ 
	public void sort (int[] a){
		//������ʱ���������С����
		int temp;
		//for (int i=a.length-1;i>0;i--){
		//for(int j=0;j<i;j++){
		for (int i=0;i<a.length-1;i++){//��ѭ��,�߼���
			for(int j=0;j<a.length-1-i;j++)  { 	//��ѭ��,�Ƚ�
				//���ǰ�����ִ��򽻻�
				if(a[j]>a[j+1]) {
					//����λ��
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;		
				}
			}
		}
	}	
}


/* 
 * 3 1 5 4 2
 * ��һ��ѭ��
 * 1 3 5 4 2		4
 * 1 3 5 4 2		
 * 1 3 4 5 2
 * 1 3 4 2 5
 * �ڶ���ѭ��
 * 1 3 4 2			3
 * 1 3 4 2			
 * 1 3 2 4
 * ������ѭ��
 * 1 3 2			2
 * 1 2 3		
 * ���Ĵ�ѭ��
 * 1 2				1
 */
