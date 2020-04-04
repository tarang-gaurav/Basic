
public class Node {
//properties
	Node next;
	int data;
	
	public Node(int newData){
		data=newData;
		next=null;
	}
	
	//Methods and constructor
	public Node(int newData,Node newNext){
		data=newData;
		next=newNext;
	}
	
	
	public int getData(){
		return data;
	}
	
	public void setData(int newData){
		data=newData;
		
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node newNode) {
		next = newNode;
	}
	
	
}
