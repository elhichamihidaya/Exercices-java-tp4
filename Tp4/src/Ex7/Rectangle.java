package Ex7;

public class Rectangle extends Forme {

    double longueur;
    double largeur;
    
    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }
    public void validerDimensions() {
    	if (largeur > 0 && longueur > 0) {
            System.out.println("Dimensions valides");
        } else {
            System.out.println("Dimensions invalides");
        }
    }
    public double calculerPerimetre() {
        return 2 * (longueur + largeur);
    }
    public double calculerSurface() {
        return longueur * largeur;
    }
}
