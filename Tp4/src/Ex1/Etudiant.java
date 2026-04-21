package Ex1;

public class Etudiant extends Personne{
	String niveau;
	double moyenne;
	
	public Etudiant( String nom, String prenom, int age, String niveau, double moyenne) {
		super(nom, prenom, age);
		this.niveau=niveau;
		this.moyenne=moyenne;
	}
	
	public String calculerMention() {
		if (moyenne >= 16)
			return "Très bien";
        else if (moyenne >= 14)
            return "Bien";
        else if (moyenne >= 12)
            return "Assez bien";
        else if (moyenne >= 10)
            return "Passable";
        else
            return "Aucune mention";
	}
	public boolean estAdmis() {
        return moyenne >= 10;
    }
	public void afficherProfil() {
		afficherInformations();
		System.out.println("Niveau:" + niveau);
		System.out.println("Moyenne:" + moyenne);
		System.out.println("Mention:"+ calculerMention());
        System.out.println("Admis: " + (estAdmis() ? "Oui" : "Non"));
			
	}
}

