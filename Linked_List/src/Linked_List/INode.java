package Linked_List;

public interface INode<K> {
	int getKey();

	void setkey(K key);

	INode getNext();

	void setNext(INode next);
}