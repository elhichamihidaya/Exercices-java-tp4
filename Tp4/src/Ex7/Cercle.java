package Ex7;

public class Cercle extends Forme {

    double rayon;
    public Cercle(double rayon) {
    	this.rayon=rayon;
    }
    
    public double calculerPerimetre() {
        return  2 * 3.14 * rayon;
    }
    
    public void validerDimensions() {
    	if (rayon > 0) {
            System.out.println("Rayon valide");
        } else {
            System.out.println("Rayon invalide");
        }
    }

    public double calculerSurface() {
    	return 3.14 * rayon * rayon;
    }
    
    
}
