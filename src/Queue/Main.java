package Queue;

public class Main {
	public static void main(String args[]){
		Queue<Integer> q = new Queue<>();
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.enqueue(60);
		q.enqueue(70);
		System.out.println("Size of Queue  "+q.size());
		q.show();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();

		
		q.dequeue();
		System.out.println("=========");
		q.show();
		System.out.println(q.isEmpty());
	}
}
