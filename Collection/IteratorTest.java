package javase.Collection;
import java.util.*;
/*	
 * Iterator是一个接口，它是集合的迭代器。集合可以通过Iterator去遍历集合中的元素
 * Iterator的定义:public interface Iterator<E> {}
 * 方法：
 * 	abstract boolean hasNext(); 是否存在下一个元素
	abstract E next(); 获取下一个元素
	abstract void remove(); 删除当前元素
 * 
 */
 
public class IteratorTest {
	public static void main(String[] args) {
		//创建集合对象
		Collection c1 = new LinkedList();
		//Collection c2 = new ArrayList();
		
		//添加元素
		c1.add(100);
		c1.add(20.0);
		c1.add(true);
		
		//迭代
		Iterator iterator1 = c1.iterator();
		//Iterator iterator2 = c2.iterator();
		
		//System.out.println(iterator1);//java.util.LinkedList$ListItr@9e89d68
		//System.out.println(iterator2);//java.util.ArrayList$Itr@3b192d32
		
		//System.out.println(iterator1.hasNext()); //true
		
		//遍历,迭代(while循环)
		while(iterator1.hasNext()) {
			Object element = iterator1.next();
			System.out.println(element);
		}
		
		//for循环
		for(Iterator iterator2 = c1.iterator(); iterator2.hasNext(); ) {
			Object o = iterator2.next();
			System.out.println(o);
		}
	}
}
