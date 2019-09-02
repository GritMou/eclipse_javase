package javase.StackModel;

public class Test {
	public static void main(String[] args) throws StackOperationException {
		Stack s = new Stack();
		User u1 = new User("Jack",20);
		User u2 = new User("King",21);
		User u3 = new User("Moon",22);
		User u4 = new User("Nice",23);
		User u5 = new User("Cake",24);
		User u6 = new User("Smile",25);
		
		try{
			s.push(u1);
			s.push(u2);
			s.push(u3);
			s.push(u4);
			s.push(u5);
			//s.push(u5=6);	
		}catch(StackOperationException s1) {
			s1.printStackTrace();
		}

		try {
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
			//System.out.println(s.pop());	
		}catch(StackOperationException s2) {
			s2.printStackTrace();
		}
	}
} 

class User{
	
	String name;
	int age;
	
	User(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return "User[name="+name+",age="+age+"]";
		
	}
}