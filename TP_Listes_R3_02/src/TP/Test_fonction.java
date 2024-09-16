package TP;

public class Test_fonction {

	public static void main(String[] args) {
		Liste_chainee l=new Liste_chainee();
		l.ajouter(1);
		l.ajouter(2);
		l.ajouter(3);
		l.ajouter(4);
		l.afficher();
		System.out.println(" ------");
		l.Insertion_en_tete(10);
		l.afficher();
		System.out.println(" ------");
		l.trouve_avant_dernier();
		System.out.println(" ------");
		l.Echanger(10,3);
		l.afficher();
	}

}
