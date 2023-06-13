package Księgarnia;

public class Main {
    public static void main(String[] args) {
        Podręcznik malyksiaze = new Podręcznik("dramat","PWN",1995,"Mały książe","Antoine de Saint-Exupéry","Książka opowiada o peryprtiach mlodego chlopca");
        Klient k1 = new Klient("Adam","Nowacki","Dramat",34,malyksiaze);
        Klient k2 = new Klient("Adam","Nowacki","Dramat",34,malyksiaze);
        Klient k3 = new Klient("Adam","Nowacki","Dramat",34,malyksiaze);
        Klient k4 = new Klient("Adam","Nowacki","Dramat",34,malyksiaze);
        Klient k5 = new Klient("Adam","Nowacki","Dramat",34,malyksiaze);
        Klient[] klienci1 = new Klient[5];
        klienci1[0]=k1;
        klienci1[1]=k2;
        klienci1[2]=k3;
        klienci1[3]=k4;
        klienci1[4]=k5;
        Księgarnia sowa = new Księgarnia("Krakowska 213","Sówka",4,klienci1);
        malyksiaze.opis();
        k1.klientinfo();

    }
}
