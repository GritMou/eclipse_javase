package javase.Collection;
import java.util.*;
/*
 * boolean contains(Object o);	判断集合中是否包含某元素
 * boolean remove(Object o);  删除集合中某元素
 * 
 * 存储在集合中的元素需要重写equals方法
 */
public class ContainsTest {
	public static void main(String[] args) {
		
		//创建集合
		Collection c = new ArrayList();
		//创建Integer类型对象
		Integer in1 = new Integer(10);
		
		//添加元素
		c.add(in1);
		
		//判断集合中是否包含in1
		System.out.println(c.contains(in1));//true
		
		//创建Integer类型对象
		Integer in2 = new Integer(10);
		System.out.println(c.contains(in2));//true
		
		//创建学生对象
		Student s1 = new Student("XiaoMing",20);
		c.add(s1);
		System.out.println(c.contains(s1));//true
		
		Student s2 = new Student("XiaoMing",20);
		//重写equals前
		//System.out.println(c.contains(s2));//false，Student类没有重写equals方法
		//重写equals后
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
	//重写equals方法
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
