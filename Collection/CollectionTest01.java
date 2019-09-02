package javase.Collection;

import java.util.*;

/*
 * Collection �Ķ��壺public interface Collection<E> extends Iterable<E> {}
 * ��Ҫ������
 * 	abstract boolean     add(Object element);���Ԫ��
	abstract boolean	 addAll(Collection<? extends E> collection)
	abstract void		 clear();  ��ռ���
	abstract boolean     contains(Object object);  �жϼ������Ƿ����ĳԪ��
	abstract boolean     containsAll(Collection<?> collection)
	abstract boolean     equals(Object object)
	abstract int         hashCode()
	abstract boolean     isEmpty(); �жϼ������Ƿ���Ԫ��
	abstract boolean     remove(Object object);  ɾ��������ĳԪ��
	abstract boolean     removeAll(Collection<?> collection)
	abstract boolean     retainAll(Collection<?> collection)
	abstract int         size(); ��ȡ������Ԫ�صĸ���
	abstract <T> T[]     toArray(T[] array)
	abstract Object[]    toArray();  ���ذ�����collection������Ԫ�ص�����
	
	abstract Iterator<E> iterator(); ��ȡ�����������ĵ���������
 */
public class CollectionTest01 {
	public static void main(String[] args) {
		//��������
		Collection c = new ArrayList(); //��̬
		
		//���Ԫ��
		c.add(1);
		c.add(new Integer(12));
		
		Object o = new Object();
		c.add(o); //Collection����ֻ�ܵ�������Ԫ�أ�����ֻ�ܴ洢��������
		
		Customer cus = new Customer("Mike",20);
		c.add(cus);
		
		//��ȡԪ��
		System.out.println(c.size()); //4��
		//�ж��Ƿ�Ϊ��
		System.out.println(c.isEmpty()); //false
		
		//������ת����Object��������
		Object[] objs = c.toArray();
		for(int i=0;i<objs.length;i++) {
			System.out.println(objs[i]);
		}
		
		//���
		c.clear();
		System.out.println(c.size()); //0��
		System.out.println(c.isEmpty()); //true	
	}

}
class Customer{
	String name;
	int age;
	Customer(String name,int age){
		this.name = name;
		this.age = age;
	}
	public String toString(){
		return "Customer[name="+name+",age="+age+"]";

	}
}