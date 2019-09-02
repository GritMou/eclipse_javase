package javase.Collection;

import java.util.*;

/*
 * Collection 的定义：public interface Collection<E> extends Iterable<E> {}
 * 主要方法：
 * 	abstract boolean     add(Object element);添加元素
	abstract boolean	 addAll(Collection<? extends E> collection)
	abstract void		 clear();  清空集合
	abstract boolean     contains(Object object);  判断集合中是否包含某元素
	abstract boolean     containsAll(Collection<?> collection)
	abstract boolean     equals(Object object)
	abstract int         hashCode()
	abstract boolean     isEmpty(); 判断集合中是否有元素
	abstract boolean     remove(Object object);  删除集合中某元素
	abstract boolean     removeAll(Collection<?> collection)
	abstract boolean     retainAll(Collection<?> collection)
	abstract int         size(); 获取集合中元素的个数
	abstract <T> T[]     toArray(T[] array)
	abstract Object[]    toArray();  返回包含此collection中所有元素的数组
	
	abstract Iterator<E> iterator(); 获取集合所依赖的迭代器对象
 */
public class CollectionTest01 {
	public static void main(String[] args) {
		//创建集合
		Collection c = new ArrayList(); //多态
		
		//添加元素
		c.add(1);
		c.add(new Integer(12));
		
		Object o = new Object();
		c.add(o); //Collection集合只能单个储存元素，并且只能存储引用类型
		
		Customer cus = new Customer("Mike",20);
		c.add(cus);
		
		//获取元素
		System.out.println(c.size()); //4个
		//判断是否为空
		System.out.println(c.isEmpty()); //false
		
		//将集合转换成Object类型数组
		Object[] objs = c.toArray();
		for(int i=0;i<objs.length;i++) {
			System.out.println(objs[i]);
		}
		
		//清空
		c.clear();
		System.out.println(c.size()); //0个
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