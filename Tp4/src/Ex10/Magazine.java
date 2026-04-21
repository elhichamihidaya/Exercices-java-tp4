package Ex10;

public class Magazine extends Document implements Empruntable {
	
    int numero;
    String datePublication;

    public Magazine(String id, String t, String a, int num, String date) {
        super(id, t, a);
        numero = num;
        datePublication = date;
    }

    public int calculerDureeEmpruntMax() {
    	return 3; 
    	} 

    public boolean estDisponible() {
    	return disponible;
    	}
    public void reserver() {
    	System.out.println("Magazine reserve"); 
    	}
}
