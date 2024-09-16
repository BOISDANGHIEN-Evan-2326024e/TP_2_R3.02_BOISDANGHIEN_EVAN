package TP;

public class Test_exo_1_2 {

	public static void main(String[] args) {
		Liste_doublement_chainee l=new Liste_doublement_chainee();
		l.ajouter(1);
		l.ajouter(2);
		l.ajouter(3);
		l.ajouter(4);
		l.ajouter(5);
		l.ajouter(6);
		l.afficher();
		System.out.println(" ------");
		//l.echanger(2,5);
		//l.afficher();
		
		// réponse question 8 : L'algorithme le plus rapide est le premier car il a moins di'térations.
		
		System.out.println(" ------");
		Liste_doublement_chainee l2=new Liste_doublement_chainee();
		l2.ajouter(1);
		l2.ajouter(2);
		l2.ajouter(3);
		l2.ajouter(4);
		l2.ajouter(5);
		l2.ajouter(6);
		l2.afficher();
		
		System.out.println(l.equals_liste_doublement_chainee(l2));
	}

}
