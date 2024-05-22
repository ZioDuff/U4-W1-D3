package Esercizio2;

public class Main {
    public static void main(String[] args) {
        Sim sim1 = new Sim(1111111);
        Chiamata[] listaChiamate = new Chiamata[5];
        listaChiamate[0] = new Chiamata(20, "1311331");
        listaChiamate[1] = new Chiamata(20, "1311331");
        listaChiamate[2] = new Chiamata(20, "1311331");
        listaChiamate[3] = new Chiamata(20, "1311331");
        listaChiamate[4] = new Chiamata(20, "1311331");

        sim1.setListaChiamate(listaChiamate);
        sim1.stampaSim();


    }
}
