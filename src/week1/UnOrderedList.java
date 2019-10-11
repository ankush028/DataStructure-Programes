package week1;

public class UnOrderedList<T> {
	private Node head =null;
	Node tail=null;
	private int size =0;
	
	public void add(T data){
		Node n = new Node(data);
		if(head ==null){
			head =n;
			tail =n;
			size++;
		}else{
		
			tail.next =n;
			tail =n;
			size++;	
	}
		}
	public void remove(T item){
		Node current = head;
		Node prev = null;
		if(head.data.equals(item)){
			head = head.next;
			size-=1;
			return;
		}
		while(!current.data.equals(item)){
			prev = current;
			current = current.next;
		}
		current = current.next;
		prev.next = current;
		current = null;
		size-=1;
	}public void removeAtLast(){
//		Node n = head;
//		Node prev = null;
//		while(n.next!=null){
//			prev = n;
//			n = n.next;
//		}
//	//	System.out.println("hello heyy");
//		prev.next = null;
//		size--;
		if(head == null){
			System.out.println("List is already Empty");
		}else{
			if(head!= tail){
				Node current = head;
				while(current.next!=tail){
					current = current.next;
				}
				tail = current;
				tail.next = null;
			}
			else{
				head = tail = null;
			}
		}
	}
	public boolean search(T item){
		Node n = head;
		while(n.next!= null){
			if(n.data.equals(item)){
				return true;
			}
			n = n.next;
		}
		return false;
	}
	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		return false;
	}

	/**
	 * Funtion to check the size of list and return it
	 * 
	 * @return the size of the list
	 */
	public int size() {
		return size;
	}

	/**
	 * Function to return the index of the item assuming it is present
	 * 
	 * @param item the item to return the index of
	 * @return the index of the passed item
	 */
	public int index(T item) {
		int index = 0;
		Node n = head;
		while (!n.data.equals(item)) {
			n = n.next;
			index++;
		}
		return index;

	}

	/**
	 * Function to insert the item at given index
	 * 
	 * @param pos  the index at which to insert
	 * @param item the item which to insert
	 * @throws IndexOutOfBoundsException if index is greater than size of list or is
	 *                                   less than 0
	 */
	public void insert(int pos, T item) throws IndexOutOfBoundsException {
		if (pos > size || pos < 0) {
			throw new IndexOutOfBoundsException();
		}
		int index = 0;
		Node n = head;
		Node node = new Node(item);
		if (pos == 0) {
			node.next = head;
			head = node;
		} else {
			while (index != pos) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
		size++;
	}

	/**
	 * function to remove the item from the last of list and return it
	 * 
	 * @return the last element of list after removing
	 */
	public T pop() {
		Node n = head;
		if (size == 1) {
			head = head.next;
			size--;
			return (T) n.data;
		}
		while (n.next != null) {
			n = n.next;
		}
		T ret = (T) n.data;
		n = n.next;
		size -= 1;
		return ret;
	}

	/**
	 * Function to return the element at the given position
	 * 
	 * @param pos the index at which the item to return
	 * @return the element at the given index after removing it
	 */
	@SuppressWarnings("unchecked")
	public T pop(int pos) {
		int index = 0;
		Node n = head;
		if (pos == 0) {
			head = head.next;
			size--;
			return (T) n.data;
		}
		Node prev = null;
		while (index != pos) {
			prev = n;
			n = n.next;
			index++;
		}
		prev.next = n.next;
		size -= 1;
		return (T) n.data;
	}

	/**
	 * overriden method to give elements of list as string
	 */
	@Override
	public String toString() {
		StringBuffer s = new StringBuffer();
		s.append("[ ");
		Node node = head;
		while (node != null) {
			s.append(node.data);
			node = node.next;
			s.append(",");
		}
		s.append(" ]");
		return s.toString();
	}

	/**
	 * method to show the items in the list
	 */
	public void show() {
		System.out.println(toString());
	}

}
