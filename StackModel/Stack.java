package javase.StackModel;
//ʹ�� һά����ģ��ջ���ݽṹ
public class Stack {
	
	//ʹ������洢����
	Object[] elements;
	
	//ջĬ�ϵĳ�ʼ������Ϊ5
	Stack(){
		this(5);
		//elements = new Object[5];
	}
	
	Stack(int max){
		elements = new Object[max];
	}
	
	//ģ��ջָ֡
	int index;
	
	//ѹջ����
	public void push(Object element) throws StackOperationException {
		/*
		 elements[index] = element;
		 index++;
		 */
		if(index == elements.length) {
			//�쳣
			throw new StackOperationException ("ջ������");
		}
		elements[index++] = element;	
	}
	
	//��ջ����
	//��������Ԫ��
	public Object pop() throws StackOperationException { //ջ����Ԫ�����ⵯ
		if(index == 0) {
			throw new StackOperationException ("ջ�ѿգ�");
		}
		return elements[--index]; 
		/*
		index--;
		return elements[index]; 
		*/		
	}
}
