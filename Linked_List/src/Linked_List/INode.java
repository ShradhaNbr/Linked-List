package Linked_List;

public interface INode<K> {
K getKey();
void setkey(K Key);
INode getNext();
void setNext(INode next);
}