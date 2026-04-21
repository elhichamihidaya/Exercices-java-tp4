package Ex10;

public class Utilisateur {
    String identifiant;
    String nom;

    public Utilisateur(String id, String n) {
        identifiant = id;
        nom = n;
    }

    public void emprunterDocument(Document d) {
        System.out.println(nom + " essaie d'emprunter");
        d.emprunter();
    }

    public void retournerDocument(Document d) {
        d.retourner();
    }
}
