package javase.Collection;
import java.util.*;
/*	
 * Iterator��һ���ӿڣ����Ǽ��ϵĵ����������Ͽ���ͨ��Iteratorȥ���������е�Ԫ��
 * Iterator�Ķ���:public interface Iterator<E> {}
 * ������
 * 	abstract boolean hasNext(); �Ƿ������һ��Ԫ��
	abstract E next(); ��ȡ��һ��Ԫ��
	abstract void remove(); ɾ����ǰԪ��
 * 
 */
 
public class IteratorTest {
	public static void main(String[] args) {
		//�������϶���
		Collection c1 = new LinkedList();
		//Collection c2 = new ArrayList();
		
		//���Ԫ��
		c1.add(100);
		c1.add(20.0);
		c1.add(true);
		
		//����
		Iterator iterator1 = c1.iterator();
		//Iterator iterator2 = c2.iterator();
		
		//System.out.println(iterator1);//java.util.LinkedList$ListItr@9e89d68
		//System.out.println(iterator2);//java.util.ArrayList$Itr@3b192d32
		
		//System.out.println(iterator1.hasNext()); //true
		
		//����,����(whileѭ��)
		while(iterator1.hasNext()) {
			Object element = iterator1.next();
			System.out.println(element);
		}
		
		//forѭ��
		for(Iterator iterator2 = c1.iterator(); iterator2.hasNext(); ) {
			Object o = iterator2.next();
			System.out.println(o);
		}
	}
}
