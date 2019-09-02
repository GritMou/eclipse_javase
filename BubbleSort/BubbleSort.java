package javase.BubbleSort;
/*
 * 	冒泡排序：
 * 	原理是临近的数字两两进行比较,按照从小到大或者从大到小的顺序进行交换
 *  3 1 5 4 2
 *  
 *  1 2 3 4 5
 * */
//实现接口类
public class BubbleSort implements Sort{ 
	public void sort (int[] a){
		//创建临时变量储存较小数字
		int temp;
		//for (int i=a.length-1;i>0;i--){
		//for(int j=0;j<i;j++){
		for (int i=0;i<a.length-1;i++){//外循环,走几次
			for(int j=0;j<a.length-1-i;j++)  { 	//内循环,比较
				//如果前面数字大则交换
				if(a[j]>a[j+1]) {
					//交换位置
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
 * 第一次循环
 * 1 3 5 4 2		4
 * 1 3 5 4 2		
 * 1 3 4 5 2
 * 1 3 4 2 5
 * 第二次循环
 * 1 3 4 2			3
 * 1 3 4 2			
 * 1 3 2 4
 * 第三次循环
 * 1 3 2			2
 * 1 2 3		
 * 第四次循环
 * 1 2				1
 */
