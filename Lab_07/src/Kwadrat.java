

class Kwadrat extends Prostokat implements IFigury{
	Kwadrat(int bok,String kolor){
		super(bok,bok,kolor);
	}

	@Override
	public String opis() {
		return "Obiekt klasy kwadrat";
	}

	@Override
	void skaluj(float skala) {
		wys=wys*(int)skala;

	}

	@Override
	public float getPowierzchnia() {
		return wys*wys;
	}

	@Override
	public boolean wPolu(Punkt p) {
		return true;
	}
}