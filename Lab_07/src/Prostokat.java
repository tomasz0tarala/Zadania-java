
class Prostokat extends Figura implements IFigury{
	int wys=0;
	int szer=0;
	
	Prostokat(int wys,int szer,String kolor){
		this.wys = wys;
		this.szer = szer;
		super.kolor = kolor;
	}
	public String opis(){
		return "Obiekt klasy prostokąt, Prostokat o wymairach: "+szer+" x "+wys;
	}

	@Override
	public float getPowierzchnia() {
		return szer*wys;
	}

	@Override
	public boolean wPolu(Punkt p) {
		return true;
	}

	@Override
	void skaluj(float skala) {
		szer=szer*(int)skala;
		wys=wys*(int)skala;
	}
}