package Esercizio1;

public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo1 = new Rettangolo(3, 2);

        Rettangolo rettangolo2 = new Rettangolo(6, 4);

        System.out.println(Rettangolo.stampaRettangolo(rettangolo1));
//        perimetro ed area primo rettangolo
//        (-----------------------------------------------------)
        System.out.println(Rettangolo.stampaRettangolo(rettangolo2));
//        perimetro ed area secondo rettangolo
        //        (-----------------------------------------------------)
        // perimetro ed area del primo e secondo rettangolo piu somma dei perimetri
        System.out.println(Rettangolo.stampaDueRettangoli(rettangolo1, rettangolo2));


    }
}
