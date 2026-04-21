package Ex10;

public class Main {
    public static void main(String[] args) {
        
        Livre l = new Livre("01", "Java POO", "MOHAMED", 300, "Technique");

        Magazine m = new Magazine("50", "Science ", "Collectif", 120, "2026-04");

        DocumentNumerique d = new DocumentNumerique("9", "Cours POO", "Prof", "PDF", 2.5);

        Utilisateur user = new Utilisateur("020", "HIDAYA");

        System.out.println("test du livre");
        l.afficherDetails(); 
        user.emprunterDocument(l); 
        user.emprunterDocument(l); 
        l.retourner();

        System.out.println("\n test du magazine");
        m.afficherInformations();
        System.out.println("Duree emprunt: " + m.calculerDureeEmpruntMax() + " jours");
        user.emprunterDocument(m);

        System.out.println("\n test du pdf ");
        d.consulter();
        d.afficherResume();
    }
}
