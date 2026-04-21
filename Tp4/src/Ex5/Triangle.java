package Ex5;

class Triangle extends Figure{
	double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void dessiner() {
        System.out.println("Dessiner un triangle");
    }
    public double calculerPerimetre() {
        return a + b + c;
    }

    public double calculerSurface() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s-a)*(s-b)*(s-c));
    }
}
