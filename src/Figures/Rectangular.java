package Figures;
//prostopadloscian
public class Rectangular {
//pola-----------------------------------
    private double a,b,c;
    String name;
//konstruktor------------------------------------------------

    public Rectangular() {
    }

    public Rectangular(double a, double b, double c, String name) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.name = name;
    }
//gettery,settery-------------------------------------------------

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//metody
    public void setInput(){
        Input in = new Input();
        System.out.println("\t\t\tPodaj nazwę Prostopadłościanu: ");
        setName(in.InputString());
        System.out.println("\t\t\tPodaj długości boków Prostopadłościanu: ");
        setB(in.InputDouble());
        setA(in.InputDouble());
        setC(in.InputDouble());
    }
    public double pole(double a, double b, double c){return 2*((a*b)+(a*c)+(b*c));}
    public double objetosc(double a, double b, double c){return a*b*c;}
    public void wypisz(){
        System.out.format("\t\t\tFigura prostopadłościan o nazwie: %s, długośc boków: %.2f, %.2f, %.2f, pole: %.2f,"+" objętość: %.2f\n\n", name, a, b, c,pole(a,b,c),objetosc(a,b,c));
    }

}
