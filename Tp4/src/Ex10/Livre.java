package Ex10;

public class Livre extends Document implements Empruntable {
	
	 int nombreDePages;
	 String genre;

	 public Livre(String id, String t, String a, int pages, String g) {
	     super(id, t, a);
	     nombreDePages = pages;
	     genre = g;
	 }

	 public int calculerDureeEmpruntMax() {
		 return 15; 
		 }

	 public boolean estDisponible() { 
		 return disponible; 
		 }
	 
	 public void reserver() { 
		 System.out.println("Livre reserve."); 
		 }

	 public void afficherDetails() {
	     afficherInformations();
	     System.out.println("Pages: " + nombreDePages + "Genre: " + genre);
	     }
}
