package Esercizio2;

public class Chiamata {
    //    ATTRIBUTI
    private double callDuration;
    private String callNumber;

    // COSTRUTTORE
    public Chiamata(double callDuration, String callNumber) {
        this.callDuration = callDuration;
        this.callNumber = callNumber;
    }

    //    METODI
    public double getCallDuration() {
        return callDuration;
    }

    public String getCallNumber() {
        return callNumber;
    }
}
