package Buildings;

public class Main {
    public static void main(String[] args) {
        Building museum = new Building("Muzeum",12,1999);
        Building urządMiasta = new Building("Urząd Miasta",15,2014);
        Building museum2 = new Building("Muzeum Wojny",15,2004);
        museum.howOld();
        museum.displayInfo();
        museum2.howOld();
        museum2.displayInfo();
        urządMiasta.howOld();
        urządMiasta.displayInfo();

    }
}
