package TP;

public class Node_V3<T>{
	private T element;
	private Node_V3 previous,next;
	
	public Node_V3(T info) {
		element=info;
		previous=null;
		next=null;
	}
	
	public T getElement() { return element; }
	
	public Node_V3 getNext() { return next; }
	
	public void setElement(T newElem) { element = newElem;}
	
	public void setNext(Node_V3 newNext) { next = newNext ;}
	
	public Node_V3 getPrevious() { return previous ;}
	
	public void setPrevious(Node_V3 newPrev) { previous= newPrev;}
	
}
