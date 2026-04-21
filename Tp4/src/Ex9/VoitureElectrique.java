package Ex9;

public class VoitureElectrique extends Vehicule implements Electrique {

    private double batterie = 50; // %

    public VoitureElectrique(double vitesse) {
        super(vitesse);
    }

    public void demarrer() {
        System.out.println("La voiture électrique démarre silencieusement");
    }

    public void charger() {
        batterie = 100;
        System.out.println("Batterie chargée à 100%");
    }

    public void verifierBatterie() {
        System.out.println("Niveau batterie: " + batterie + "%");
    }

    public void afficherAutonomie() {
        System.out.println("Autonomie estimée: " + (batterie * 2) + " km");
    }

    public void optimiserConsommation() {
        System.out.println("Mode économie activé");
    }
}
