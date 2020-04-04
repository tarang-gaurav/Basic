import java.util.LinkedList;


public class Queuey {

	
	LinkedList queue;
	
	//Making a queue instance
	public Queuey(){
		queue=new LinkedList();
	}
	
	
	//to check whether queue is empty
	public boolean isEmpty(){
		return queue.isEmpty();
	}
	
	
	//to return the size of the queue
	public int size(){
		return queue.size();
	}
	
	//to add in FirstInFirstOut order
	public void enqueue(int n){
		queue.addLast(n);
	}
	//to delete in order
	public int dequeue(){
		return (int) queue.remove(0);
	}
	
	
	//
	public int peek(){
		return (int)queue.get(0);
	}
	public static void main(String[] args){
		Queuey q=new Queuey();
		
		q.enqueue(9);
		q.enqueue(8);
		q.enqueue(7);
		q.enqueue(6);
		
		System.out.println(q.peek());
		q.dequeue();
		System.out.println(q.size());
		System.out.println(q.isEmpty());
		//System.out.println(q.);
		
		
	}
}
