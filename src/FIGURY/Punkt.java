package FIGURY;

public class Punkt {
    double x;
    double y;

    public Punkt() {
        x = 0;
        y = 0;
    }

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public  void zeruj(){
        x=0;
        y=0;
    }
    public  void opis(){
        System.out.println("Wartość współrzędnej x: "+getX()+" Wartość współrzędnej y: "+getY());
    }
    public  void przesun(int a, int b){
        x=getX()+a;
        y=getY()+b;
    }

}
