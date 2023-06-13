package FIGURY;
class Prostokat extends Figura {
	double wys=0, szer=0;
	Punkt A = new Punkt(0.0,0.0);
	Punkt B = new Punkt(0.0,0.0);
	Punkt C = new Punkt(0.0,0.0);
	Punkt D = new Punkt(0.0,0.0);
	Prostokat(double wys,double szer, Punkt A, Punkt B, Punkt C, Punkt D){
		this.wys = wys;
		this.szer = szer;
		this.A = A;
		this.B = B;
		this.C = C;
		this.D = D;

	}

	public Prostokat(String kolor, double wys, double szer) {
		super(kolor);
		this.wys = wys;
		this.szer = szer;
	}

	double getPowierzchnia() {
        return (szer * wys);
    }
    public void przesun(float x, float y){
		A.setX(A.x+x);
		B.setX(B.x+x);
		C.setX(C.x+x);
		D.setX(D.x+x);
		A.setY(A.y+y);
		B.setY(B.y+y);
		B.setY(B.y+y);
		D.setY(D.y+y);
	}

	@Override
	String opis() {
		return "Klasa Prostokąt. Kolor obiektu: "+kolor+" Wysokość prostokąta: "+wys+" Szerokość prostokąta: "+szer;
	}
}