package Linked_List;

public class MyLinkedList {
	public INode head;
	public INode tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void add(INode newNode) { 
		if (this.tail == null) 
			this.tail = newNode;

		if (this.head == null) 
			this.head = newNode;
		
		else {
			tail.setNext(newNode);
			tail=newNode;
			
		}
	}
	public void append(INode newNode) { 
		if (this.tail == null) 
			this.tail = newNode;

		if (this.head == null) 
			this.head = newNode;
		
		else {
			head.setNext(newNode);
			head=newNode;
			
		}
	}

	public void insert(INode myNode, INode newNode) {
		INode tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
		
	}

}