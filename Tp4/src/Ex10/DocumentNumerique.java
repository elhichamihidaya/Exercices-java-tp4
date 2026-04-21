package Ex10;

public class DocumentNumerique extends Document implements Consultable {
	
    String format;
    double tailleFichier;

    public DocumentNumerique(String id, String t, String a, String f, double size) {
        super(id, t, a);
        format = f;
        tailleFichier = size;
    }

    public int calculerDureeEmpruntMax() {
    	return 0; 
    	}

    public void consulter() { System.out.println("Ouverture du fichier " + format ); }
    public void afficherResume() { System.out.println("Resume du document numerique de " + tailleFichier + " MB"); }
}
