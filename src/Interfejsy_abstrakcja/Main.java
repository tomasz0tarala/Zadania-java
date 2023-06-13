package Interfejsy_abstrakcja;

public class Main {
    public static void main(String[] args) {
        Car s1 = new Car("Opel");
        s1.start();
        s1.stop();

        Dog pies = new Dog("Reksio");
        pies.start();
        pies.stop();
        System.out.println(pies.getType());
        System.out.println(pies.getvoice(1));

        //        wyscig
        System.out.println();
        wyscig(new Bike(), new Car("opel"),new Dog("reksio"), new Bike());
    }
    public static void wyscig(Moveable... moveables){
        for (Moveable m: moveables) {
            m.start();
            if (m instanceof Dog)
                System.out.println("Imie psa: "+((Dog)m).getName());
        }
    }
}
