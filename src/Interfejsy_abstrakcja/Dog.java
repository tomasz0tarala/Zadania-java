package Interfejsy_abstrakcja;

public class Dog extends Animal implements Moveable, Speakable{
    @Override
    public String getType(){
        return  null;
    }

    @Override
    public void start() {
        System.out.println("pies wystartowal");
    }

    @Override
    public void stop() {
        System.out.println("pies sie zatrzymal");
    }

    @Override
    public String getvoice(int voice) {
        if(LOUD == voice)return "HAU HAU";
        else if(QUIET == voice)return "hau hau";
        else return  null;
    }
    public Dog (){}
    public Dog (String name){super(name);}

}
