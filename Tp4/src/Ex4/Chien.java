package Ex4;

public class Chien extends Animal{
	@Override
    public void crier() {
        System.out.println("Le chien aboie");
    }

    public void garder() {
        System.out.println("Le chien garde");
    }
    
    public void jouer() {
    	System.out.println("le chien joue");
    }
}
