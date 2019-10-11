package week1;
public class OrderedList<T extends Comparable<T>> {
	private Node head = null;
	Node tail ;
	private int size =0;
	

	public void insert(T data){
		Node current = head;
		Node temp = new Node(data);
		size++;
		if (head == null) {
			
			head = temp;
			head.next = tail;
			tail = head;
		} else if (data.compareTo((T) head.data) < 0) {
			temp.next = head;
			head = temp;
		} else {
			if (data.compareTo((T) tail.data) > 0) {
				tail.next = temp;
				tail = temp;
				return;
			}
			Node prev = null;
			while (data.compareTo((T) current.data) > 0 && current.next != null) {
				prev = current;
				current = current.next;
			}
			prev.next = temp;
			temp.next = current;
		}
		}
	public void midSearch(){
		Node a = head;
		Node b = head;
		while(a!= null&& b!=null){
			a = a.next;
			b = b.next.next;
		}
		System.out.println(a.data);
	}

	public void removeAtLast(){
		if(head == null){
			System.out.println("list is already empty");
		}else{
			Node current = head;
			Node prev = null;
			while(current.next!=null){
				prev = current;
				current = current.next;
			}
			prev.next = null;
			size--;
			
		}
	}
	public void remove (T item){
		
		if(head.data.equals(item)){
			head = head.next;
			size--;
		}else{
			Node current = head;
			Node prev = null;
			while(!current.data.equals(item)){
				prev = current;
				current = current.next;
			}
			current = current.next;
			prev.next = current;
			size--;
			
		}
	}
	public boolean search(T item){
		Node current = head;
		while(current!=null){
			if(current.data.equals(item)){
				return true;
			}
			current = current.next;
		}
	return false;
			}
	public int size(){
		return size;
	}
	public boolean isEmpty(){
		if(head==null){
			return true;
		}
		return false;
	}
	public int index(T item){
		Node current = head;
		int index =1;
		if(head.data.equals(item)){
	
			return index;
		}else{
			while(!current.data.equals(item)){
				index++;
				current = current.next;		
			}
			return index;
		}
	}
	public T pop(){
		Node current = head;
		Node prev = null;
		while (current.next != null) {
			prev = current;
			current = current.next;
		}
		prev.next = null;
		tail = prev;
		size -= 1;
		return (T)current.data;
	}
	public void show(){
		Node n = head;
		while(n.next!=null){
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println(n.data);
	}

}
