package Esercizio2;

import java.util.Arrays;

public class Sim {
    //    ATTRIBUTI
    private int phoneNumber;
    private double credit;
    private Chiamata[] lastCall;

    //COSTRUTTORE
    public Sim(int phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.credit = 0;
        this.lastCall = new Chiamata[5];


    }

    //    METODI
    public void setLastCall(Chiamata[] lastCall) {
        this.lastCall = lastCall;
    }

    public void stampaSim() {
        System.out.println("Number " + this.phoneNumber);
        System.out.println("Credit " + this.credit);
        System.out.println("lastCall " + Arrays.toString(this.lastCall));
    }
}
