package Ex4;

public class Main {
    public static void main(String[] args) {

        Animal a1 = new Chien();
        Animal a2 = new Chat();

        a1.crier(); 
        a2.crier(); 

        a1.manger();
        a2.dormir();


        
        Chien c = new Chien();
        c.crier();
        c.garder();

        Chat ch = new Chat();
        ch.crier();
        ch.ronronner();
    }
}
