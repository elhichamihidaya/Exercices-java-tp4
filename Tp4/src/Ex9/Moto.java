package Ex9;

public class Moto extends Vehicule {

    private String typeMoto = "Sport";

    public Moto(double vitesse) {
        super(vitesse);
    }

    public void demarrer() {
        System.out.println("La moto démarre avec bruit ");
    }

    public void faireRoueArriere() {
        System.out.println("La moto fait une roue arrière !");
    }

    public void afficherTypeMoto() {
        System.out.println("Type de moto: " + typeMoto);
    }
}
