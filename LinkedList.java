
public class LinkedList {

	//properties
	
	Node head;
	int count;
	//constructors
	/*public LinkedList(){
		head=null;
		count=0;
	}*/
	
	public LinkedList(Node newHead){
		head=newHead;
		count=1;
	}
	
	
	//add
	
	public void add(int newData){
		Node temp=new Node(newData);
		Node current=head;
		while(current.getNext()!=null){
			current=current.getNext();
		}
		current.setNext(temp);
		count++;
	}
	 
	//remove
	
	public void remove(){
		Node current=head;
		while(current.getNext().getNext()!=null){
			current=current.getNext();
		}
		current.setNext(null);
		count--;
	}
	//get
	
	public int get(int index){
		if(index<=0)
			return -1;
		Node current=head;
		for(int i=1;i<index;i++){
			current=current.getNext();
		}
		return current.getData();
		
	}
	
	
	
	
	
	//isEmpty
	public boolean isEmpty(){
		
		return head==null;
	}
	
	//size
	
	public int getSize(){
		return count;
	}
	
	
	public static void main(String []args){
		
	}
	
}
