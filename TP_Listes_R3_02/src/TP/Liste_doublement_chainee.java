package TP;

public class Liste_doublement_chainee {
	private Node_V2 head;
	private int size;
	
	public Liste_doublement_chainee() {
		head=null;
		size=0;
	}
	
	public void ajouter(int nom) {
        if (head == null) {
            head = new Node_V2(nom,null,null); // Si la liste est vide, le premier élément devient le head
        } else {
            Node_V2 current = head;
            while (current.getNext() != null) {
                current = current.getNext(); // Avance jusqu'au dernier nœud
            }
            Node_V2 next=new Node_V2(nom,current,null); // Ajoute le nouveau nœud à la fin
            current.setNext(next);
        }
    }
	
	public void afficher() {
		Node_V2 n=head;
		while(n.getNext()!=null) {
			System.out.println(n.getElement());
			n=n.getNext();
		}
		System.out.println(n.getElement());
	}
	
	public void echanger(int echange1,int echange2) {
		Node_V2 n=head;
		Node_V2 echange1_node = null;
		Node_V2 echange2_node = null;
		while(n.getNext()!=null) {
			if(n.getElement()==echange1) {
				echange1_node=n;
			}
			if(n.getElement()==echange2) {
				echange2_node=n;
			}
			n=n.getNext();
		}
		Node_V2 v1=new Node_V2(echange1_node.getElement(),echange2_node.getPrevious(),echange2_node.getNext());
		Node_V2 v2=new Node_V2(echange2_node.getElement(),echange1_node.getPrevious(),echange1_node.getNext());
		Node_V2 h=head;
		while(h.getNext()!=null) {
			if(h.getNext().getElement()==v2.getElement()) {
				h.setNext(v1);
				h.getNext().getNext().setPrevious(v1);
				h=h.getNext();
				continue;
			}
			if(h.getNext().getElement()==v1.getElement()) {
				h.setNext(v2);
				h.getNext().getNext().setPrevious(v2);
				h=h.getNext();
				continue;
			}
			h=h.getNext();
		}
	}
	
	public int compte_liste_circulaire() {
		Node_V2 n=head;
		int compteur=1;
		while(n.getNext()!=head) {
			compteur+=1;
			n=n.getNext();
		}
		return compteur;
		
	}
	
	public boolean equals_liste_doublement_chainee(Liste_doublement_chainee l2) {
		Node_V2 n1=this.head;
		int compteur_l1=1;
		Node_V2 n2=l2.head;
		int compteur_l2=1;
		while(n1.getNext()!=null) {
			compteur_l1+=1;
			n1=n1.getNext();
		}
		while(n2.getNext()!=null) {
			compteur_l2+=1;
			n2=n2.getNext();
		}
		if(compteur_l1!=compteur_l2) {
			return false;
		}
		n1=this.head;
		n2=l2.head;
		while(n1.getNext()!=null) {
			if(!(n1.getElement()==n2.getElement()) || !(n1.getNext().equals(n2.getNext())) || !(n1.getPrevious().equals(n2.getPrevious()))) {
				System.out.println(n1.getNext().equals(n2.getNext()));
				System.out.println(n2.getNext());
				System.out.println(n1.getPrevious());
				System.out.println(n2.getPrevious());
				return false;
			}
			n1=n1.getNext();
			n2=n2.getNext();
		}
		return true;
		
	}
}
