package javase.StackModel;
//使用 一维数组模拟栈数据结构
public class Stack {
	
	//使用数组存储数据
	Object[] elements;
	
	//栈默认的初始化容量为5
	Stack(){
		this(5);
		//elements = new Object[5];
	}
	
	Stack(int max){
		elements = new Object[max];
	}
	
	//模拟栈指帧
	int index;
	
	//压栈方法
	public void push(Object element) throws StackOperationException {
		/*
		 elements[index] = element;
		 index++;
		 */
		if(index == elements.length) {
			//异常
			throw new StackOperationException ("栈已满！");
		}
		elements[index++] = element;	
	}
	
	//弹栈方法
	//弹出的是元素
	public Object pop() throws StackOperationException { //栈顶的元素往外弹
		if(index == 0) {
			throw new StackOperationException ("栈已空！");
		}
		return elements[--index]; 
		/*
		index--;
		return elements[index]; 
		*/		
	}
}
