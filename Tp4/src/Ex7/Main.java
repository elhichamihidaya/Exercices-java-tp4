package Ex7;

public class Main {
    public static void main(String[] args) {

        Forme f1 = new Rectangle(5, 3);
        Forme f2 = new Cercle(2);

        System.out.println("Forme 1");
        f1.afficherDescription();
        System.out.println("Surface: " + f1.calculerSurface());

        System.out.println("Forme 2");
        f2.afficherDescription();
        System.out.println("Surface: " + f2.calculerSurface());

        System.out.println("Comparaison");
        f1.comparerSurface(f2);

        Rectangle r = (Rectangle) f1;
        System.out.println("Périmètre rectangle: " + r.calculerPerimetre());

        Cercle c = (Cercle) f2;
        System.out.println("Périmètre cercle: " + c.calculerPerimetre());
    }
}
