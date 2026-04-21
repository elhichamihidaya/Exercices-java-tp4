package Ex10;

public abstract class Document {
	String identifiant;
	String titre;
	String auteur;
	boolean disponible=true;
	
	public Document(String id, String t, String a) {
        identifiant = id;
        titre = t;
        auteur = a;
    }
	public void emprunter() {
        if (disponible) {
            disponible = false;
            System.out.println("Document emprunte: " + titre);
        }
        else {
            System.out.println("Impossible: " + titre + " n'est pas disponible");
        }
    }
	public void retourner() {
        disponible = true;
        System.out.println("Document retourne: " + titre);
    }
	public void afficherInformations() {
        System.out.println("ID: " + identifiant + "Titre:" + titre + "Auteur: " + auteur);
    }
	public abstract int calculerDureeEmpruntMax();

}
