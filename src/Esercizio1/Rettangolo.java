package Esercizio1;

public class Rettangolo {
    //    ATTRIBUTI
    private double altezza;
    private double larghezza;

    //    COSTRUTTORE
    public Rettangolo(double altezza, double larghezza) {
        this.larghezza = larghezza;
        this.altezza = altezza;
    }

    //    METODI
    public static String stampaRettangolo(Rettangolo myRectangle) {
        return "questo è il perimetro " + myRectangle.perimetro() + " e questa è l'area " + myRectangle.area();
    }

    public static String stampaDueRettangoli(Rettangolo x1, Rettangolo x2) {
        return "PRIMO RETTANGOLO " + stampaRettangolo(x1) + " SECONDO RETTANGOLO " + stampaRettangolo(x2) + " SOMMA PERIMETRI "
                + (x1.perimetro() + x2.perimetro());
    }


    public double perimetro() {
        return altezza * 2 + larghezza * 2;
    }

    public double area() {
        return (altezza * larghezza) / 2;
    }
}
