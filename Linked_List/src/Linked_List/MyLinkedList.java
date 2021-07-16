package Linked_List;

public class MyLinkedList {
	public INode head;
	public INode tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}
	public void append(INode newNode) {
		if(this.tail == null) {
			this.tail = newNode;
		}
	
	if(this.head == null) {
		this.head = newNode;
	}
	else {
		INode tempNode = this.tail;
		this.tail = newNode;
		this.tail.setNext(tempNode);
	}
	}
}
