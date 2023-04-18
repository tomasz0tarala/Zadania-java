package Buildings;

import java.time.LocalDate;

public class Building {
    private String name ;
    private int numberOfFloors ;
    private int year ;
    public Building(String name, int numberOfFloors, int year) {
        this.name = name;
        this.numberOfFloors = numberOfFloors;
        this.year = year;
    }

    public Building() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void howOld(){
        if (LocalDate.now().getYear()-year==1)
            System.out.println("Budynek ma "+(LocalDate.now().getYear()-year)+" rok");
        else
            System.out.println("Budynek ma "+(LocalDate.now().getYear()-year)+" lat/a");
    }
    public void displayInfo(){
        System.out.println("Nazwa Budynku: "+name+" rok oddania do użytku: "+year+" liczba pięter "+numberOfFloors);
    }
}
