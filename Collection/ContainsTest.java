package javase.Collection;
import java.util.*;
/*
 * boolean contains(Object o);	�жϼ������Ƿ����ĳԪ��
 * boolean remove(Object o);  ɾ��������ĳԪ��
 * 
 * �洢�ڼ����е�Ԫ����Ҫ��дequals����
 */
public class ContainsTest {
	public static void main(String[] args) {
		
		//��������
		Collection c = new ArrayList();
		//����Integer���Ͷ���
		Integer in1 = new Integer(10);
		
		//���Ԫ��
		c.add(in1);
		
		//�жϼ������Ƿ����in1
		System.out.println(c.contains(in1));//true
		
		//����Integer���Ͷ���
		Integer in2 = new Integer(10);
		System.out.println(c.contains(in2));//true
		
		//����ѧ������
		Student s1 = new Student("XiaoMing",20);
		c.add(s1);
		System.out.println(c.contains(s1));//true
		
		Student s2 = new Student("XiaoMing",20);
		//��дequalsǰ
		//System.out.println(c.contains(s2));//false��Student��û����дequals����
		//��дequals��
		System.out.println(c.contains(s2)); //true
	}
}
class Student {
	int age;
	String name;
	Student(String name,int age){
		this.name = name;
		this.age= age;
	}
	//��дequals����
	public boolean equals(Object o) {
		if(this==o) return true;
		if(o instanceof Student) {
			Student s = (Student)o;
			if(s.age==this.age&&s.name.equals(this.name)) {
				return true;
			}
		}
		return false;
	}
}
