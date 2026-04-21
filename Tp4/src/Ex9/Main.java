package Ex9;

public class Main {
    public static void main(String[] args) {

        Vehicule v1 = new VoitureElectrique(0);
        Vehicule v2 = new Moto(0);

        System.out.println("Voiture Électrique:");
        v1.demarrer();
        v1.accelerer(50);

        System.out.println("Moto:");
        v2.demarrer();
        v2.accelerer(80);

        Electrique e = (Electrique) v1;
        e.verifierBatterie();
        e.charger();

        VoitureElectrique ve = (VoitureElectrique) v1;
        ve.afficherAutonomie();

        Moto m = (Moto) v2;
        m.faireRoueArriere();
        m.afficherTypeMoto();
    }
}
