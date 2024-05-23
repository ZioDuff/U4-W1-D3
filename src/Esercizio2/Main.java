package Esercizio2;

public class Main {
    public static void main(String[] args) {
        Sim sim1 = new Sim(1111111);
        Chiamata[] lastCall = new Chiamata[5];
        lastCall[0] = new Chiamata(20, "1311331");
        lastCall[1] = new Chiamata(20, "1311331");
        lastCall[2] = new Chiamata(20, "1311331");
        lastCall[3] = new Chiamata(20, "1311331");
        lastCall[4] = new Chiamata(20, "1311331");

        sim1.setLastCall(lastCall);
        sim1.stampaSim();


    }
}
