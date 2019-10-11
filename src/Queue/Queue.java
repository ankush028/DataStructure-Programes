package Queue;

public class Queue<T> {
	private Object queue[] = new Object[50];
		int front =0;
		int rear =0;
		int size =0;
	public void enqueue(T data){
		if(rear ==50){
			System.out.println("Queue is full");
		}else{
			queue[rear] = data;
			rear++;
			size++;
		}
		
	}
	public Object dequeue(){
		Object data = queue[front];
		front++;
		rear--;
		size--;
		return data;
	}
	public boolean isEmpty(){
		if(rear ==0){
			return true;
		}
		
		return false;
		
	}
	public int size(){
		return rear;
	}
	public void show(){
		for(int i=0;i<rear;i++){
			System.out.println(queue[front+i]);
		}
		
	}

}
