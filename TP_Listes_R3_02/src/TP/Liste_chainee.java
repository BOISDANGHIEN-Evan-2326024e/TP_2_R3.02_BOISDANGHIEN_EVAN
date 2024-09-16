package TP;

public class Liste_chainee {
	private Node head;
	private int size;
	
	public Liste_chainee(){
		head=null;
		size=0;
	}
	
	public void ajouter(int nom) {
        if (head == null) {
            head = new Node(nom,null); // Si la liste est vide, le premier élément devient le head
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext(); // Avance jusqu'au dernier nœud
            }
            Node next=new Node(nom,null); // Ajoute le nouveau nœud à la fin
            current.setNext(next);
        }
    }
	
	public void afficher() {
		Node n=head;
		while(n.getNext()!=null) {
			System.out.println(n.getElement());
			n=n.getNext();
		}
		System.out.println(n.getElement());
	}
	
	public void Insertion_en_tete(int nom) {
		if (head == null) {
            head = new Node(nom,null); // Si la liste est vide, le premier élément devient le head
        } else {
        	Node ancien_head=head;
        	head = new Node(nom,ancien_head);
        }
	}
	
	public void trouve_avant_dernier() {
		Node n=head;
		while(n.getNext().getNext()!=null) {
			n=n.getNext();
		}
		System.out.println(n.getElement());
	}
	
	public void reverse() {
        Node previous = null;
        Node current = head;
        Node next = null;
        
        while (current != null) {
            next = current.getNext(); // Stocke le prochain nœud
            current.setNext(previous); // Inverse le lien
            previous = current; // Avance previous
            current = next; // Avance current
            head = previous;
        }
	}
	
	public void Update(int noeud_a_changer,int nouvelle_valeur) {
		Node n=head;
		while(n.getNext()!=null) {
			if(n.getNext().getElement()==(noeud_a_changer)) {
				Node next=n.getNext();
				n.getNext().setElement(nouvelle_valeur);
				n.setNext(next);
			}
			n=n.getNext();
		}
	}
	
	public void Delete (int noeud_a_suppr) {
		Node n=head;
		while(n.getNext()!=null) {
			if(n.getNext().getElement()==noeud_a_suppr) {
				Node next=n.getNext();
				n.setNext(next.getNext());
			}
			n=n.getNext();
		}
	}
	
	public void Echanger(int echange1,int echange2) {
		Node n=head;
		while(n.getNext()!=null) {
			if(n.getElement()==echange1) {
				n.setElement(echange2);
				n=n.getNext();
				continue;
			}
			if(n.getElement()==echange2) {
				n.setElement(echange1);
				n=n.getNext();
				continue;
			}
			n=n.getNext();
		}
	}
}
