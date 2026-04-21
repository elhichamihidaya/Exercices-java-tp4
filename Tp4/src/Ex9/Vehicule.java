package Ex9;

public abstract class Vehicule {

    protected double vitesse;

    public Vehicule(double vitesse) {
        this.vitesse = vitesse;
    }

    public void accelerer(double v) {
        vitesse += v;
        System.out.println("Vitesse après accélération: " + vitesse);
    }

    public void freiner(double v) {
        vitesse -= v;
        if (vitesse < 0) vitesse = 0;
        System.out.println("Vitesse après freinage: " + vitesse);
    }

    public abstract void demarrer();
}
