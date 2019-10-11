package stack;

public class Stack<T>{
	
	private Object stack[] = new Object[50];
	int top = 0;
	public void push(T data){
		if(top ==49){
			System.out.println("Stack is overflow");
		}else{	
		stack[top] = data;
		top++;	
		}
	}
	public T pop(){
		if(isEmpty()){
			System.err.println("Cannot pop , stack is empty");
		return null;
		}else{
			T data = (T)stack[top];
			top--;
			return data;
		}
	}
	public boolean isEmpty(){
		if(top ==0){
			return true;
		}
		return false;
	}
	public int size(){
		return top;
	}
	public T peek(){
		return(T) stack[top];
	}
	public void show(){
		for(int i =0;i<=top;i++){
			System.out.println(stack[i]);
		}
	}

}
