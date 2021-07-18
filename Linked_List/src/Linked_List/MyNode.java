package Linked_List;

public class MyNode<K> implements INode<K> {
	int key;
	INode next;

	public MyNode(K key) {
		this.key = (int) key;
		this.next = null;
	}

	public int getKey() {
		return key;
	}

	@Override
	public void setkey(K key) {
		this.key = (int) key;
	}

	public INode getNext() {
		return next;
	}

	public void setNext(INode next) {
		this.next = next;
	}
}