package ejerReloj;

public class Main {

    public static void main(String[] args) {
        
        // 3 relojes usando el patrón singleton    
        Reloj r = Reloj.getInstancia();
        Reloj r2 = Reloj.getInstancia();
        Reloj r3 = Reloj.getInstancia();
        
//      // 3 relojes sin usar el patrón singleton      
//      Reloj r4 = new Reloj();
//      Reloj r5 = new Reloj();
//      Reloj r6 = new Reloj();
    }

}
