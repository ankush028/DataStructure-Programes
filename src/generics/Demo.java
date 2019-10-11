package generics;
class Node<Ankush>{
	Ankush data;
	Node next;
	Node(Ankush data){
		this.data = data;
		this.next = null;
	}
	Node head = null;
	Node tail = null;

public  class Demo<Ankush>{
	public void insert(Ankush data){
		Node n = new Node(data);
		if(head == null){
			head = n;
			tail = n;
		}else{
			tail.next = n;
			while(tail!= null){
				tail = tail.next;
			}
			
		}
		
	}
	
	
	
	public void main(String[] args) {
		Demo t = new Demo();
//		t.print("hello"+10);
//		t.print(12);
		t.insert(30);

		
		
	}
	

	}


}