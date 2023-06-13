package FIGURY;

public class Okrag extends Figura{
    Punkt srodek;
    double promien;

    public Okrag() {
        srodek.x=0;
        srodek.y=0;
        promien=0;
    }
    public Okrag(Punkt srodek, double promien) {
        this.srodek = srodek;
        this.promien = promien;
    }

    public double getPromien() {
        return promien;
    }

    public void setPromien(double p) {
        promien = p;
    }
    public double getPowierzchania(){
        return Math.PI* Math.pow(promien,2);
    }
    public double getSrednica(){
        return 2*promien;
    }
    public void wSrodku(Punkt pkt, Punkt srodek){
        if ((Math.pow((pkt.x-srodek.x),2)+Math.pow((pkt.y-srodek.y),2)<=Math.pow(promien,2))){
            System.out.println("Punkt znajduje się w okręgu");
        }
        else
            System.out.println("Punkt nie znajduje się w okręgu");
    }

    @Override
    String opis() {
        return "Klasa Okrąg. Kolor obiektu: "+kolor+" Środek koła: ("+srodek.x+","+srodek.y+") Promień koła: "+promien;
    }
}
