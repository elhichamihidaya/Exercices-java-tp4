package Ex3;

public class Main {
    public static void main(String[] args) {

        CompteCourant cc = new CompteCourant(10000,4500);
        cc.deposer(2000);
        cc.retirer(500); 
        cc.calculerFrais();
        cc.afficher();

        CompteEpargne ce = new CompteEpargne(20000, 0.02);
        ce.ajouterInterets();
        ce.afficher();
    }
}