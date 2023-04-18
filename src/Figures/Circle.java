package Figures;
//kolo
public class Circle {
// pola-----------------------------------------------
    private double r;
    String name;
//konstruktor----------------------------------------

    public Circle() {
    }

    public Circle(double r, String name) {
        this.r = r;
        this.name = name;
    }
//getery,settery----------------------------------
    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//    metody--------------------------------------------------
    public void setInput(){
        Input in = new Input();
        System.out.println("\t\t\tPodaj nazwę Koła: ");
        setName(in.InputString());
        System.out.println("\t\t\tPodaj promien koła: ");
        setR(in.InputDouble());
    }
    public double pole(double r){return Math.PI*Math.pow(r,2);}
    public double obwod(double r){return 2*Math.PI*r;}
    public void wypisz(){
        System.out.format("\t\t\tFigura koło o nazwie: %s, promien: %.2f, pole: %.2f,"+" obowód: %.2f\n\n", name, r ,pole(r),obwod(r));
    }

}
