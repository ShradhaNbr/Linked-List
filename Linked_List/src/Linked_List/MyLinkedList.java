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
			tail = newNode;

		}
	}

	public void append(INode newNode) {
		if (this.tail == null)
			this.tail = newNode;

		if (this.head == null)
			this.head = newNode;

		else {
			head.setNext(newNode);
			head = newNode;

		}
	}

	public void insert(INode myNode, INode newNode) {
		INode tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);

	}

	public void pop() {
		INode tempNode = head;
		while (tempNode.getNext() != tail) {
			tempNode = tempNode.getNext();
		}
		tempNode.setNext(null);
		tail = tempNode;
	}

	public void search() {
		if (head == null)
			System.out.println("List is empty");
		else {
			INode currentNode = head;
			while (currentNode != null) {
				int position = 1;
				position++;
				if (currentNode.getKey().equals(30))
					System.out.println("\nElement is present at " + position);
				currentNode = currentNode.getNext();
			}
		}

	}

	public void display() {
		INode currentNode = head;

		System.out.print("LinkedList: ");

		while (currentNode != null) {
			// Print the data at current node
			System.out.print(currentNode.getKey() + " ");

			// Go to next node
			currentNode = currentNode.getNext();
		}
	}

}