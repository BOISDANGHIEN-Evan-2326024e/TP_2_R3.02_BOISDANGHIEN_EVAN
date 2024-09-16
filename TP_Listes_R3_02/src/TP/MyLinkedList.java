package TP;

public class MyLinkedList<T> implements List<T>{
	private Node_V3<T> head; // Le début de la liste
    private Node_V3<T> tail; // La fin de la liste
    private int size;
    
    public MyLinkedList() {
    	head=null;
    	tail=null;
    	size=0;
  
    }
    
    public void ajouter(T element) {
        Node_V3<T> newNode = new Node_V3<>(element);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrevious(tail);
            tail=newNode;
        }
        size++;
    }
    
    public int size() {
        return size;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

    private void checkIndexForAdd(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
    }
    
    private Node_V3<T> getNodeAt(int index) {
        Node_V3<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }
    
    public T remove(int index) {
        checkIndex(index);
        Node_V3<T> node = getNodeAt(index);
        Node_V3<T> prev = node.getPrevious();
        Node_V3<T> next = node.getNext();

        if (prev != null) {
            prev.setNext(next);
        } else {
            head = next;
        }

        if (next != null) {
            next.setPrevious(prev);
        } else {
            tail = prev;
        }
        
    }
    
    
}
