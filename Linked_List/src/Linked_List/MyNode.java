package Linked_List;

public class MyNode<K> implements INode<K> {
	K key;
	INode next;

	public MyNode(K key) {
		this.key = key;
		this.next = null;
	}

	public K getKey() {
		return key;
	}

	@Override
	public void setkey(K key) {
		this.key = key;
	}

	public INode getNext() {
		return next;
	}

	public void setNext(INode next) {
		this.next = next;
	}

}