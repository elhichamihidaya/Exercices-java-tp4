package Ex2;

public class Main {
	public static void main(String[] args) {
		Voiture v1 = new Voiture("BMW", 4, "Essence");
		v1.demarrer();
	    v1.afficherDetails();
	    v1.klaxonner();
	    v1.arreter();
	}
}

