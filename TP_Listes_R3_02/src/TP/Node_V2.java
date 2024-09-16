package TP;

public class Node_V2 {
	private int element;
	private Node_V2 previous,next;
	
	public Node_V2(int e,Node_V2 p,Node_V2 n) {
		element=e;
		previous=p;
		next=n;
	}

	public int getElement() { return element; }
	
	public Node_V2 getNext() { return next; }
	
	public void setElement(int newElem) { element = newElem;}
	
	public void setNext(Node_V2 newNext) { next = newNext ;}
	
	public Node_V2 getPrevious() { return previous ;}
	
	public void setPrevious(Node_V2 newPrev) { previous= newPrev;}
	
	
	
}
