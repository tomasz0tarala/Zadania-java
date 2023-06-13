

class Trojkat extends Figura implements IFigury{
	int wys=0;
	int podst=0;
	Trojkat(int wys,int podst,String kolor){
		
		this.wys = wys;
		this.podst = podst;
		super.kolor = kolor;
	}
	public String opis(){
		return "Trojkat o wymairach: "+wys+"  "+podst;
	}

	@Override
	void skaluj(float skala) {
		podst=podst*(int)skala;
		wys=wys*(int)skala;
	}

	@Override
	public float getPowierzchnia() {
		return (podst*wys)/2;
	}

	@Override
	public boolean wPolu(Punkt p) {
		return true;
	}
}