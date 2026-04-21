package Ex5;

class Cercle extends Figure {
    double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }
    
    public void dessiner() {
        System.out.println("Dessiner un cercle");
    }

    public double calculerPerimetre() {
        return 2 * Math.PI * rayon;
    }

    public double calculerSurface() {
        return Math.PI * rayon * rayon;
    }
}