package Ex8;

public class Avion implements Volant {

	public void voler() {
        System.out.println("L'avion decolle avec ses reacteurs");
    }

    public void atterrir() {
        System.out.println("L'avion descend sur la piste d'atterrissage");
    }

    public void changerAltitude() {
        System.out.println("Le pilote ajuste l'altitude de l'avion");
    }

    public void embarquerPassagers() {
        System.out.println("Les passagers montent dans l'avion");
    }

    public void afficherAltitude() {
        System.out.println("Altitude actuelle: 10000 metres");
    }
}