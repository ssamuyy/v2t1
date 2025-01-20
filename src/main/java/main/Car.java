package main;

public class Car {
    private String merkki;
    private String malli;
    private int nopeus;

    public Car() {
        this.merkki = "OletusMerkki";
        this.malli = "OletusMalli";
        this.nopeus = 0;
    }

    public void status() {
        System.out.println("Auto: " + merkki + " " + malli + ", Nopeus: " + nopeus + "km/h");
    }
    
    public void asetaMerkki(String merkki) {
        this.merkki = merkki;
    }

    public void asetaMalli(String malli) {
        this.malli = malli;
    }

    public void kiihdyta(int maara) {
        if (maara < 0) {
            System.out.println("Nopeuden täytyy olla positiivinen luku.");
        }
        else {
            this.nopeus += maara;
        }
    }

    public void hidasta(int maara) {
        if (maara < 0) {
            System.out.println("Nopeuden täytyy olla positiivinen luku.");
        }
        else if (maara >= this.nopeus) {
            this.nopeus = 0;
        }
        else {
            this.nopeus -= maara;
        }
    }
}
