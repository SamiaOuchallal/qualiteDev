package mainpackage;

import org.junit.jupiter.params.shadow.com.univocity.parsers.common.StringCache;

public class Voiture {

    private String marque;
    private double prix;

    public Voiture(String m, double p){
        this.marque=m;
        this.prix = p;
    }

    public void setMarque(String m){
        this.marque=m;
    }

    public void setPrix(double p){
        this.prix=p;
    }

    public String getMarque(){
        return this.marque;
    }

    public double getPrix(){
        return this.prix;
    }


    public String toString(){
        return "La voiture coûte "+ this.getPrix()+ " et est de marque " +this.getMarque();
    }
}
