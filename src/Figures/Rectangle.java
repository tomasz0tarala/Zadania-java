package Figures;
//prostokat
public class Rectangle {
//pola-----------------------------------
    private double a,b;
    String name;
//konstruktor------------------------------------------------

    public Rectangle() {}

    public Rectangle(double a, double b, String name) {
        this.a = a;
        this.b = b;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//metody---------------------------------------------------
    public void setInput(){
        Input in = new Input();
        System.out.println("\t\t\tPodaj nazwę Prostokąta: ");
        setName(in.InputString());
        System.out.println("\t\t\tPodaj długości boku Prostokąta: ");
        setA(in.InputDouble());
        setB(in.InputDouble());
    }
    public double pole(double a,double b){return a*b;}
    public double obwod(double a,double b){return 2*(a+b);}
    public void wypisz(){
        System.out.format("\t\t\tFigura prostokąt o nazwie: %s, o długości boków: %.2f, %.2f, pole: %.2f,"+" obowód: %.2f\n\n", name, a, b, pole(a,b), obwod(a,b));
    }
}
