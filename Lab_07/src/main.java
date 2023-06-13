
class main
{
	public static void main(String[] arg)
	{
		Prostokat prostokat = new Prostokat(3, 6, "czerwony");
		Trojkat rownoboczny = new Trojkat(7, 4, "biały");
		Kwadrat kwadrat = new Kwadrat(4,"czarny");
		Punkt pkt1 = new Punkt(3,6);
//		System.out.println(kwadrat.opis());
//		System.out.println(prostokat.opis());
		Figura tablica10figur[] = new Figura[10];
		Prostokat prostokat1 = new Prostokat(2,3,"szary");
		Prostokat prostokat2 = new Prostokat(4,8,"czerwony");
		Prostokat prostokat3 = new Prostokat(6,5,"zielony");
		Prostokat prostokat4 = new Prostokat(7,5,"brązowy");
		Kwadrat kwadrat1 = new Kwadrat(4,"niebieski");
		Kwadrat kwadrat2 = new Kwadrat(5,"pomarańczowy");
		Kwadrat kwadrat3 = new Kwadrat(1,"granatowy");
		Kwadrat kwadrat4 = new Kwadrat(8,"żółty");
		Trojkat trojkat = new Trojkat(5,6,"zielony");
		Trojkat trojkat1 = new Trojkat(7,9,"czarny");
		tablica10figur[0]=prostokat;
		tablica10figur[1]=prostokat1;
		tablica10figur[2]=prostokat2;
		tablica10figur[3]=prostokat3;
		tablica10figur[4]=prostokat4;
		tablica10figur[5]=kwadrat1;
		tablica10figur[6]=kwadrat2;
		tablica10figur[7]=kwadrat3;
		tablica10figur[8]=kwadrat4;
		tablica10figur[9]=trojkat;
		for (Figura m:tablica10figur) {
			System.out.println(m.opis());
		}
		System.out.println();
		//IFigury
		IFigury tablicaIfigur[] = new IFigury[3];
		tablicaIfigur[0] = prostokat;
		tablicaIfigur[1] = kwadrat2;
		tablicaIfigur[2] = trojkat1;
		for (IFigury element:tablicaIfigur) {
			System.out.println(element.getPowierzchnia());
			System.out.println(element.wPolu(pkt1));
		}

		//Interfejs ruch figur
		Okrag ok = new Okrag(1,2,pkt1);
		System.out.println(pkt1.x+", "+pkt1.y);
		ok.przesun(3,5);
		System.out.println(ok.srodek.x+", "+ok.srodek.y);
		ok.skaluj(5.6f);
		System.out.println(ok.pole);
		ok.opis();
	}
}