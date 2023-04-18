package Figures;
//szescian
public class Cube {
// pola-----------------------------------------------
    private double a;
    String name;
//konstruktor----------------------------------------

    public Cube() {
    }

    public Cube(double a, String name) {
        this.a = a;
        this.name = name;
    }
//getery,settery----------------------------------
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//metody--------------------------------------------------
    public void setInput(){
        Input in = new Input();
        System.out.println("\t\t\tPodaj nazwę Sześcianu: ");
        setName(in.InputString());
        System.out.println("\t\t\tPodaj długość boku Sześcianu: ");
        setA(in.InputDouble());
    }
    public double pole(double a){return Math.pow(a,2)*6;}
    public double objetosc(double a){return Math.pow(a,3);}
    public void wypisz(){
        System.out.format("\t\t\tFigura sześcian o nazwie: %s, długośc boku: %.2f, pole: %.2f,"+" objętość: %.2f\n\n", name, a ,pole(a),objetosc(a));
    }
}
