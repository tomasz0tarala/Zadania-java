package Figures;
//kula
public class Sphere {
// pola-----------------------------------------------
    private double r;
    String name;
//konstruktor----------------------------------------

    public Sphere() {
    }

    public Sphere(double r, String name) {
        this.r = r;
        this.name = name;
    }
//getery,settery----------------------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
//    metody--------------------------------------------------
    public void setInput(){
        Input in = new Input();
        System.out.println("\t\t\tPodaj nazwę Kuli: ");
        setName(in.InputString());
        System.out.println("\t\t\tPodaj promien Kuli: ");
        setR(in.InputDouble());
    }

    public double objetosc(double r){return 4/3*Math.PI*Math.pow(r,3);}
    public double pole(double r){return 4*Math.PI*Math.pow(r,2);}
    public void wypisz(){
        System.out.format("\t\t\tFigura kula o nazwie: %s, promień: %.2f, pole: %.2f,"+" objętość: %.2f\n\n", name, r ,pole(r),objetosc(r));
    }
}
