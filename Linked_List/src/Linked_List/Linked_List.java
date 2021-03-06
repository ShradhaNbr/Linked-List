package Linked_List;

public class Linked_List {

	public static void main(String[] args) {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(myFirstNode);
		myLinkedList.add(myThirdNode);
		myLinkedList.insert(myFirstNode, mySecondNode);
		myLinkedList.display();
		myLinkedList.search();
		myLinkedList.display();
		myLinkedList.insertAfter(40, 2);
		myLinkedList.display();
		myLinkedList.sortList();
		myLinkedList.display();
	}
}