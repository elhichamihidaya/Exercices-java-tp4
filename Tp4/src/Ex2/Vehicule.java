package Ex2;

public class Vehicule {
	String marque;
	public Vehicule(String marque) {
		this.marque=marque;
	}
	public void afficherMarque() {
		System.out.println("Marque est:" + marque);
	}
	public void demarrer() {
		System.out.println("la voiture est demarree");
	}
	public void arreter() {
		System.out.println("la voiture est arretee");
	}
}
