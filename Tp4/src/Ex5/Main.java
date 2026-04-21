package Ex5;

public class Main {
    public static void main(String[] args) {

        Figure f1 = new Cercle(2);
        Figure f2 = new Triangle(5,6,7);

        System.out.println("Cercle:");
        f1.dessiner();
        f1.deplacer(2, 3);

        System.out.println("Triangle:");
        f2.dessiner();
        f2.redimensionner(2);
        
        Cercle c = (Cercle) f1;
        System.out.println("Surface cercle: " + c.calculerSurface());

        Triangle t = (Triangle) f2;
        System.out.println("Périmètre triangle: " + t.calculerPerimetre());
    }
}