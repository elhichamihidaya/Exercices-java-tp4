package Ex8;

public class Main {
public static void main(String[] args) {
        
        Volant v1 = new Oiseau();
        Volant v2 = new Avion();

        System.out.println(" Test Oiseau");
        v1.voler();
        v1.changerAltitude();
        v1.atterrir();
        
        ((Oiseau) v1).migrer();
        ((Oiseau) v1).construireNid();

        System.out.println("\n Test Avion");
        v2.voler();
        v2.changerAltitude();
        v2.atterrir();
        
        ((Avion) v2).embarquerPassagers();
        ((Avion) v2).afficherAltitude();
    }
}
